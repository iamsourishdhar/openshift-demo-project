package openshift.demo.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(value = "/hello")
	public String printHello()
	{
		return "Hello from the other side!";
	}
}
