package main.org.young.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogAfter implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("后置通知：目标对象："+target+"方法名"+method.getName()+"方法参数的个数"+args.length+"方法的返回值"+returnValue);
    }
}
