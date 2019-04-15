package main.org.young.dao.daoImpl;

import main.org.young.dao.IStudentDao;
import main.org.young.entity.Student;
import org.springframework.stereotype.Repository;


@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao {
    @Override
    public void addStudent(Student student){

        System.out.println("增加学生");
    }
}
