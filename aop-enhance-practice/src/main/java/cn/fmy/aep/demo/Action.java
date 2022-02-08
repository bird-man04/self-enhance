package cn.fmy.aep.demo;

import java.lang.annotation.*;

/**
 * ClassName  Action<br>
 * Description <br>
 * Author fmy<br>
 * Date 2022/2/8 14:47<br>
 * Version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();

    String walk();
}
