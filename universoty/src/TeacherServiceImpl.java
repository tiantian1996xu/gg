package com.example.java20.week4.demo.university.service.impl;

import com.example.java20.week4.demo.university.domain.CommonResponse;
import com.example.java20.week4.demo.university.domain.entity.Student;
import com.example.java20.week4.demo.university.exception.ResourceNotFoundException;
import com.example.java20.week4.demo.university.respository.StudentRepository;
import com.example.java20.week4.demo.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository TeacherRepository;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository =teacherRepository;
    }

    @Override
    public CommonResponse findById(String id) {
        Optional<Teacher> stu =  teacherRepository.findById(id);
        if(stu.isEmpty()) {
            //log
            throw new ResourceNotFoundException("...");
        }
        return new CommonResponse(0, new Date(), stu.get());
    }

    @Override
    public CommonResponse findAll() {
        List<Teacher> stuList =  teacherRepository.findAll();
        return new CommonResponse(0, new Date(), teaList);
    }

    @Override
    @Transactional
    public CommonResponse insert(Teacher tea) {
        Teacher teacher = studentRepository.insert(tea);
        return new CommonResponse(0, new Date(), teacher.getId());
    }
}