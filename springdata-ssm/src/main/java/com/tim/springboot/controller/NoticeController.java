package com.tim.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tim.springboot.pojo.Notice;
import com.tim.springboot.service.NoticeService;

@RestController//支持json格式数据
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//查询所有公告
	@GetMapping("/findAll")
	public List<Notice> findAll(){
		return noticeService.findAll();
	}
	
	
	//分页查询公告
	@PostMapping("/findByPage")
	public Map<String,Object> findByPage(@RequestParam("page")Integer page,@RequestParam("rows")Integer rows){
		//{"total":100,"rows":[{},{}]}
		return noticeService.findByPage(page,rows);
	}
	
	@Autowired
	private Environment environment;
	// http://localhost:8080/hello
	
	@GetMapping("/hello")
	public String hello(){
		System.out.println(environment.getProperty("name"));
		System.out.println(environment.getProperty("url"));
		return "Hello World";
	}

}
