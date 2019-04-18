package controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import service.HelloService;

@Api(tags={"API-hello"}, description = "FeedbackController")
@RestController
public class hello {
	
	@Autowired
	public HelloService hello;
	
	@ApiOperation(value="欢迎界面", notes = "say")
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String say(){
		return "hello";
		//return hello.say();
	}

}
