package main.org.young.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("logAspectAnnotation")
@Aspect
public class LogAspectAnnotation {
    @Before("execution(public * main.org.young.service.serviceImpl.StudentServiceImpl.addStudent(..))")//属性：定义切点
    public void myBefore(){
        System.out.println("注解形式-前置通知11");
    }

    @AfterReturning("execution(public * main.org.young.service.serviceImpl.StudentServiceImpl.addStudent(..))")
    public void myAfter(){
        System.out.println("注解形式-后置通知22");
    }


}
