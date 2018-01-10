package com.in28minutes.springmvc.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TagController {
	@RequestMapping(value = "/simpletag", method = RequestMethod.GET)
	public String showSimpleTag() {
		return "simpleTag";
	}
	
	@RequestMapping(value = "/hellotag", method = RequestMethod.GET)
	public String showHelloTag() {
		return "helloTag";
	}
	
	@RequestMapping(value = "/bodytag", method = RequestMethod.GET)
	public String showBodyTag() {
		return "bodyTag";
	}
	
	@RequestMapping(value = "/attributetag", method = RequestMethod.GET)
	public String showAttributeTag() {
		return "attributeTag";
	}
}
