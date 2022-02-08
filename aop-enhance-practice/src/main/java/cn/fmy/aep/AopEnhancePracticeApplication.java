package cn.fmy.aep;

import cn.fmy.aep.demo.AopConfig;
import cn.fmy.aep.demo.DemoAnnotationService;
import cn.fmy.aep.demo.DemoMethodService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AopEnhancePracticeApplication {

    public static void main(String[] args) {
        // SpringApplication.run(AopEnhancePracticeApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();//基于注解的拦截
        demoMethodService.add();//给予方法规则的拦截
        context.close();
    }

}
