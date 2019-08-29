package com.boot3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.boot3.dao.StudentDao;
import com.boot3.model.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentDao studentDao;

	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		studentDao.save(student);
		return student;
	}
	
	@PutMapping("/student") 
	public Student updateStudent(@RequestBody Student student) {
		studentDao.save(student);
		return student;
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentDao.findAll();
	}

	@GetMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable("id") int id) {
		return studentDao.findById(id);
	}

	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		Student student = studentDao.getOne(id);
		String deletedInfo = "Deleted " + student.toString();
		studentDao.delete(student);
		return deletedInfo;
	}

	@RequestMapping("/findByFaculty")
	public ModelAndView findByFaculty(@RequestParam String faculty) {
		ModelAndView mv = new ModelAndView("showList.jsp");
		List<Student> students = studentDao.findByFaculty(faculty);
		mv.addObject("students", students);
		return mv;
	}

	@RequestMapping("/findByIdGreaterThan")
	public ModelAndView findByIdGreaterThan(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("showList.jsp");
		List<Student> students = studentDao.findByIdGreaterThan(id);
		mv.addObject("students", students);
		return mv;
	}
}
