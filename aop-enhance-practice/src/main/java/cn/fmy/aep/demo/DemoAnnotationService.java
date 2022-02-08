package cn.fmy.aep.demo;

import org.springframework.stereotype.Service;

/**
 * ClassName  DemoAnnotationService<br>
 * Description <br>
 * Author fmy<br>
 * Date 2022/2/8 14:48<br>
 * Version 1.0
 */
@Service
public class DemoAnnotationService {

    // @Action(name = "注解式拦截的add操作")
    @Action(name = "注解式拦截的add操作", walk = "aaaa")
    public void add() {
        System.out.println("真正执行到了DemoAnnotationService的add方法");
        System.out.println("DemoAnnotationService.add方法结束");
    }
}
