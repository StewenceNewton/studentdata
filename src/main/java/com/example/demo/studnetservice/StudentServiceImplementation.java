package com.example.demo.studnetservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.studentrepository.StudentRepository;
import com.example.demo.studnetentity.Student;

@Service
public class StudentServiceImplementation implements StudentService
{
	@Autowired
	StudentRepository srip;
	
	@Override
	public List<Student> fetchAllStudents() 
	{
		return srip.findAll();
	}

}
