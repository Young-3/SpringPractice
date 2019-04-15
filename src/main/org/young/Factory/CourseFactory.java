package main.org.young.Factory;

import main.org.young.newinstance.HtmlCourse;
import main.org.young.newinstance.ICourse;
import main.org.young.newinstance.JavaCourse;

public class CourseFactory {
    public static ICourse getCourse(String name) {
        if (name.equals("java")) {
            return new JavaCourse();
        } else {
            return new HtmlCourse();
        }
    }
}
