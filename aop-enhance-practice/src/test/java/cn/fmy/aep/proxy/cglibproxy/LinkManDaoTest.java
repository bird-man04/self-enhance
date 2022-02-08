package cn.fmy.aep.proxy.cglibproxy;

import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ClassName  LinkManDaoTest<br>
 * Description <br>
 * Author fmy<br>
 * Date 2022/2/8 16:19<br>
 * Version 1.0
 */
class LinkManDaoTest {

    @Test
    void save() {
        final LinkManDao linkManDao = new LinkManDao();
        // 创建cglib核心对象
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(linkManDao.getClass());
        // 设置回调
        enhancer.setCallback(new MethodInterceptor() {
            /**
             * 当你调用目标方法时，实质上是调用该方法
             * intercept四个参数：
             * proxy:代理对象
             * method:目标方法
             * args：目标方法的形参
             * methodProxy:代理方法
             */
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy)
                    throws Throwable {
                System.out.println("记录日志");
                Object result = method.invoke(linkManDao, args);
                return result;
            }
        });
        // 创建代理对象
        LinkManDao proxy = (LinkManDao) enhancer.create();
        proxy.save();
    }
}