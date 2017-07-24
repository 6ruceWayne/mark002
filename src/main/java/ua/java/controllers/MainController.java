package ua.java.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.java.services.TestInterfaceService;

@RestController
public class MainController {

	private TestInterfaceService testService;

	@Autowired(required = true)
	@Qualifier(value = "testService")
	public void setTestService(TestInterfaceService testService) {
		this.testService = testService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}
}
