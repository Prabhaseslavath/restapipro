package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Order;
import com.example.demo.repository.orderrepository;

@Service
public class orderservice {
@Autowired
orderrepository repo;

public String insertion(Order od ) {
	repo.save(od);
	return "succesfully inserted";
}
public String deletion(int orderid) {
repo.deleteById(orderid);
return "succesfully deleted";
}
//public String deletbyname(String ordername) {
//	repo.deleteByName(ordername);
//	return "successfully deleted";
//}
public Optional<Order> findbyid(int orderid) {
	return repo.findById(orderid);
	
}
//public String findbyname(String ordername) {
//	return repo.getByName(ordername);
//	
//}
public List<Order> getallorders(){
	return repo.findAll();
}
public List<Order>  insertall(List<Order> od){
	return (List<Order>) repo.saveAll(od);
}
}

