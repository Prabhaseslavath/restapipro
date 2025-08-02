package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Order;
import com.example.demo.services.orderservice;

@RestController
@RequestMapping("/api/v1")
public class ordercontroller {
@Autowired
orderservice service;
@PostMapping("/student")
public String insertion(@RequestBody Order o) {
	return service.insertion(o);
}
@DeleteMapping("/delete/{orderid}")
public String deletion(@PathVariable int orderid) {
	return service.deletion(orderid);
}
//@DeleteMapping("/deletebyname/{ordername}")
//public String deletebyname(@PathVariable String ordername) {
//	return service.deletbyname(ordername);
//
//}
@GetMapping("/getbyid/{orderid}")
public Optional<Order> findbyid(@PathVariable int orderid) {
	return service.findbyid(orderid);
}

@GetMapping("/getall")
public List<Order> getallorders(){
	return service.getallorders();
}
@PostMapping("/students")
public List<Order>  insertall(@RequestBody List<Order> od){
	return (List<Order>) service.insertall(od);
}
}
