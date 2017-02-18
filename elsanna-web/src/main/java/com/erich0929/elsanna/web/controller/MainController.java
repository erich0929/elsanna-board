package com.erich0929.elsanna.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/")
@Controller
public class MainController {
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(){
		return "/main";
	}
}
