package main.org.young.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        //方法体1
        Object result = null;
        try{
            //方法体2
            System.out.println("用环绕实现前置通知");
            //控制着目标方法的执行(之前的方法为前置通知)
             result = methodInvocation.proceed();
            //后面的方法为后置通知
            System.out.println("用环绕实现后置通知");
        }catch (Exception e){
            //方法体3
            //用环绕通知实现的异常通知
        }




        return result;//目标方法的返回值
    }
}
