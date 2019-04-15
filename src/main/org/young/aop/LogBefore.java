package main.org.young.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

//前置通知
public class LogBefore implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知。。。");
    }
}
