package com.star.sud.rest.consume.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.star.sud.common.bean.Employee;

@RestController
@RequestMapping("/template")
public class ConsumeController {

	@Autowired
	private RestTemplate restTemplate;

	private static String URL = "http://localhost:8090/employees";

	@GetMapping("/employees")
	public Object getEmployees() {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Employee> entity = new HttpEntity<Employee>(headers);
		return restTemplate.exchange(URL, HttpMethod.GET, entity, Object.class).getBody();
	}

	@GetMapping("/employees/{id}")
	public Object getEmployeesById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Employee> entity = new HttpEntity<Employee>(headers);
		return restTemplate.exchange(URL + "/" + id, HttpMethod.GET, entity, Object.class).getBody();
	}

	@PostMapping("/employees")
	public String createEmployees(@RequestBody Employee employee) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Employee> entity = new HttpEntity<Employee>(employee, headers);
		return restTemplate.exchange(URL, HttpMethod.POST, entity, String.class).getBody();
	}

	@PutMapping("/employees/{id}")
	public String updateEmployees(@PathVariable Integer id, @RequestBody Employee employee) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Employee> entity = new HttpEntity<Employee>(employee, headers);
		return restTemplate.exchange(URL + "/" + id, HttpMethod.PUT, entity, String.class).getBody();
	}

	@DeleteMapping("employees/{id}")
	public Object deleteEmployees(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Employee> entity = new HttpEntity<Employee>(headers);
		return restTemplate.exchange(URL + "/" + id, HttpMethod.PUT, entity, Object.class).getBody();
	}

}
