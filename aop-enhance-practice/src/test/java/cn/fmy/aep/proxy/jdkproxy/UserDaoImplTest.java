package cn.fmy.aep.proxy.jdkproxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

/**
 * ClassName  UserDaoImplTest<br>
 * Description <br>
 * Author fmy<br>
 * Date 2022/2/8 16:36<br>
 * Version 1.0
 */
class UserDaoImplTest {

    @Test
    void saveUser() {
        final UserDao userDao = new UserDaoImpl();
        // newProxyInstance的三个参数解释：
        // 参数1：代理类的类加载器，同目标类的类加载器
        // 参数2：代理类要实现的接口列表，同目标类实现的接口列表
        // 参数3：回调，是一个InvocationHandler接口的实现对象，当调用代理对象的方法时，执行的是回调中的invoke方法
        //proxy为代理对象
        // 参数proxy:被代理的对象
        // 参数method:执行的方法，代理对象执行哪个方法，method就是哪个方法
        // 参数args:执行方法的参数
        UserDao proxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(), (proxy1, method, args) -> {
                    System.out.println("记录日志");
                    return method.invoke(userDao, args);
                });
        proxy.saveUser();//代理对象执行方法
    }
}