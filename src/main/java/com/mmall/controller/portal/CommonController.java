package com.mmall.controller.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CommonController {

	@GetMapping("common")
	@ResponseBody
	public String commonController(String common) {
		return "hello"+common;
	}
}
