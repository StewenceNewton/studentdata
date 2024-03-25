package com.example.demo.studnetcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.studnetservice.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	StudentService ss;
	

	@GetMapping("/allstudentdetails")
	public String fetchAllStudents(Model model)
	{
		model.addAttribute("Student",ss.fetchAllStudents());
		return "studentdata";
	}
}
