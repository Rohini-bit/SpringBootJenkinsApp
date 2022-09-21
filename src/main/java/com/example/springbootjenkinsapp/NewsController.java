package com.example.springbootjenkinsapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/news")
public class NewsController {
	@GetMapping("/headline")
	@ResponseBody
	public String getLatestBusinessNewsHeadline() {
		return"Twitter is about to get its first chance to question Elon Musk under oath, and it's making a rare move in also deposing his lawyer";
		
	}

}
