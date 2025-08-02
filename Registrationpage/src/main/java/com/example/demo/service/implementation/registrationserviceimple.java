package com.example.demo.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.registration;
import com.example.demo.repository.registrationrepository;
import com.example.demo.service.registrationservice;
@Service
public class registrationserviceimple implements registrationservice {
@Autowired
registrationrepository repo;
	@Override
	public String add(registration r) {
		repo.save(r);
		return "successfully inserted";
	}

	@Override
	public String delete(int id) {
		repo.deleteById(id);
		return "succesfully deleted";
	}

	@Override
	public List<registration> getall() {
	return (List<registration>) repo.findAll();
	
	}

	@Override
	public Optional<registration> getbyid(int id) {
		return repo.findById(id);
	}

	@Override
	public String update(registration r) {
		int id=r.getId();
		registration re=repo.findById(id).get();
		re.setName(r.getName());
		re.setEmail(r.getEmail());
		re.setPassword(r.getPassword());
		re.setConfirmpassword(r.getConfirmpassword());
		re.setPrice(r.getPrice());
		repo.save(re);
		return "succesfully updated";
	}

}
