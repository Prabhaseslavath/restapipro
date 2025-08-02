package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.registration;
import com.example.demo.service.registrationservice;
@RestController
@RequestMapping("/api/v1")
public class registrationcontroller {
@Autowired
registrationservice service;

@PostMapping("/register")
public String insertion(@RequestBody registration r) {
	return service.add(r);
}
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id) {
return service.delete(id);	
}
@GetMapping("/registrations")
public List<registration> getall() {
	return service.getall();
}
@GetMapping("/getbyid/{id}")
public Optional<registration> getbyid(@PathVariable int id) {
	return service.getbyid(id);
}
@PutMapping("/update")
public String update(@RequestBody registration r) {
	return service.update(r);
}
}

