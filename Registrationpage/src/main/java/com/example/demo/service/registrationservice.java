package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.registration;

public interface registrationservice {
	 String add(registration r);
	 String delete(int id);
	 List<registration> getall();
	 Optional<registration> getbyid(int id);
	 String update(registration r);

}
