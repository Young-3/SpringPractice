package main.org.young.entity;

import main.org.young.newinstance.HtmlCourse;
import main.org.young.newinstance.ICourse;
import main.org.young.newinstance.JavaCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
    private int stuNo;
    private String stuName;
    private int stuAge;

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return this.stuNo + ","+this.stuName + ","+this.stuAge;
    }

    public void learn(String name){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ICourse course = (ICourse)context.getBean(name);
        course.learn();

    }


    //study javacourse
    public void learnJava(){
        ICourse course = new JavaCourse();
        course.learn();
    }

    //study htmlcourse
    public void learnHtml(){
        ICourse course = new HtmlCourse();
        course.learn();
    }
}

