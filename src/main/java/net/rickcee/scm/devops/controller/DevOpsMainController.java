package net.rickcee.scm.devops.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/services/")
@Slf4j
public class DevOpsMainController {
	@Autowired
	private Environment env;
	
	@RequestMapping(method = RequestMethod.GET, path = "/HealthCheck", produces = { "application/json" })
	public Object healthCheck() {
		log.debug(" -- HealthCheck");
		HashMap<String, String> result = new HashMap<>();
		result.put("result", "OK");
		return result;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/Environment", produces = { "application/json" })
	public Object environment() {
		log.debug(" -- Environment");
		HashMap<String, String> result = new HashMap<>();
		result.put("app-environment", env.getProperty("app.environment"));
		result.put("result", "OK");
		return result;
	}
	
}