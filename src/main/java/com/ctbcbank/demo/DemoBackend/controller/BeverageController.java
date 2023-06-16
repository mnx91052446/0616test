package com.ctbcbank.demo.DemoBackend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctbcbank.demo.DemoBackend.entity.Beverage;
import com.ctbcbank.demo.DemoBackend.repository.BeverageRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin
@RequestMapping("/api/beverage")
@Slf4j
public class BeverageController {
	@Autowired
	private BeverageRepository repository;
	
	@GetMapping("/all")
	public List<Beverage> getAllBeverage() {
		List<Beverage> allBeverages = new ArrayList<>();
		for(Beverage b : repository.findAll()) {
			allBeverages.add(b);
		}
		return allBeverages;
	}
	
	@PostMapping("")
	public Beverage createBeverage(@RequestBody Beverage beverage) {
		log.info("get a beverage from Angular:{}", beverage);
		Beverage creaBeverage = repository.save(beverage);
		return creaBeverage;
	}
}
