package com.ahmed.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public List<Student> findAllStudentsBySchool(Long schoolId) {
        return studentRepository.findAllBySchoolId(schoolId);
    }
}
