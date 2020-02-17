package com.viva.firstapptodeploy;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(path="/courses" , method=RequestMethod.GET)
	public List<Course> findAllCourses(){
		List<Course> courses =new ArrayList<>();
		courses.add(new Course("Angular", "fav course"));
		return courses;
	}

}
