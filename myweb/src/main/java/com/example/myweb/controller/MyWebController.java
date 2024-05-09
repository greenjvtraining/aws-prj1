package com.example.myweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.myweb.entity.MyBoard;
import com.example.myweb.repository.MyWebRepository;

@Controller
public class MyWebController {
	
	@Autowired
	private MyWebRepository myWebRepository;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/list")
	public void list(Model model) {
		List<MyBoard> list = myWebRepository.findAll();
		model.addAttribute("list", list);
	}
}
