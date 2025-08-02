package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Order;

@Repository
public interface orderrepository extends JpaRepository<Order,Integer> {

//	void deleteByName(String ordername);
//	String getByName(String ordername);

}
