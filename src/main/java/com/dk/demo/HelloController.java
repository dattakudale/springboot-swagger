package com.dk.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api
@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public @ResponseBody String hello() {

		return "Hello method from Swagger";
	}

	@RequestMapping(value = "sayHello", method = RequestMethod.GET)
	public @ResponseBody String sayHello(@RequestParam("user") String user) {

		return "Hello :" + user;
	}
}
