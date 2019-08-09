package com.fcs.controllers;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fcs.repositories.ProjectRepository;
import com.fcs.services.InsertProjectThread;

@Controller

public class HomeController {
	@Autowired
	private ProjectRepository projectRepository; 
	@GetMapping(value = "/")
	public String index() throws InterruptedException, ExecutionException {

		return "views/home/index";
	}

	@GetMapping(value = "/welcome")
	public String welcome() throws InterruptedException, ExecutionException {
		InsertProjectThread projectThread = new InsertProjectThread();
		projectThread.projectRepository=projectRepository;
		projectThread.start();
		return "welcome";
	}

}
