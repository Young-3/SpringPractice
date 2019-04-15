package main.org.young.service.serviceImpl;

import main.org.young.dao.IStudentDao;
import main.org.young.dao.daoImpl.StudentDaoImpl;
import main.org.young.entity.Student;
import main.org.young.service.IStudentService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

public class StudentServiceImpl implements IStudentService {

    IStudentDao studentDao ;


    public void setStudentDao(StudentDaoImpl studentDao) {
        this.studentDao = studentDao;
    }

    @Transactional(readOnly = false,propagation = Propagation.REQUIRED,rollbackFor = {SQLException.class,ArithmeticException.class})
    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public void deleteStudentByNo(int no) {
        System.out.println("delete student");
    }


}
