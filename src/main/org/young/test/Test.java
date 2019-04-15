package main.org.young.test;

import main.org.young.entity.AllConllectionType;
import main.org.young.entity.Course;
import main.org.young.entity.Student;
import main.org.young.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void springIoc() {
//		Student student = new Student();
//		student.setStuNo(1);
//		student.setStuName("zs");
//		student.setStuAge(23);
//		System.out.println(student);

        //Spring上下文对象：conext
        ApplicationContext conext = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        //执行从springIOC容器中获取一个 id为student的对象
        Student student = (Student)conext.getBean("student") ;
        System.out.println(student);
        //1.new
        //2.对象属性的复制

    }

    public static void learnCourse(){
        Student student = new Student();
        student.learnHtml();
        student.learnJava();
    }

    public static void learnCourseWithIoc(String name){
//        Student student = new Student();
//        student.learn("html");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = new Student();
        student.learn(name);
    }

    public static void conllectionDemo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AllConllectionType type = (AllConllectionType) context.getBean("conllectionDemo");
        System.out.println(type);
    }

    public static void testDi(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Course course = (Course)context.getBean("course");
        course.showInfo();
    }


    public static void testAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService = (IStudentService) context.getBean("studentService");
        Student student = new Student();
        student.setStuName("zs");
        student.setStuAge(23);
        studentService.addStudent(student);

        studentService.deleteStudentByNo(1);
    }

    public static void main(String[] args) {
       // learnCourse();
        //learnCourseWithFactory();
        //learnCourseWithIoc("htmlCourse");
        //testDi();
        //conllectionDemo();
        testAop();
    }


}
