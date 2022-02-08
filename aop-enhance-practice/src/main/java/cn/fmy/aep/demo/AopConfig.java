package cn.fmy.aep.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ClassName  AopConfig<br>
 * Description <br>
 * Author fmy<br>
 * Date 2022/2/8 14:51<br>
 * Version 1.0
 */
@Configuration
@ComponentScan("cn.fmy.aep")
@EnableAspectJAutoProxy
public class AopConfig {
}
