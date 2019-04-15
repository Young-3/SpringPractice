package main.org.young.service;

import main.org.young.entity.Student;

public interface IStudentService {
    public void addStudent(Student student);
    public void deleteStudentByNo(int no);
}
