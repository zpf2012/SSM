package com.hand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hand.service.IGoodService;

@Controller
public class GoodController {

	private IGoodService goodService;
	
	@RequestMapping("/good")
	public String getGood(){
		
		return "success";
	}
	
}
