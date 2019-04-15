package main.org.young.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//声明该类是前置
@Aspect
public class LogBeforeAnnotation {
    @Before("execution(public * addStudent(..))")//属性：定义切点
    public void myBefore(){
        System.out.println("前置通知的注解方式");
    }
}
