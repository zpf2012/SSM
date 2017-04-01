package com.hand.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hand.dto.Good;
import com.hand.service.IGoodService;

@Controller
public class GoodController {

	private IGoodService goodService;
	
	@RequestMapping("/good")
	public String getGood(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response) throws IOException{
		long id = Long.valueOf(request.getParameter("id"));
		Good good = goodService.getGoodByPremaryKey(id);
		modelAndView.addObject("good", good);
		return "success";
	}
	
}
