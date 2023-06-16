package com.ctbcbank.demo.DemoBackend.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ctbcbank.demo.DemoBackend.entity.Beverage;
import com.ctbcbank.demo.DemoBackend.repository.BeverageRepository;

@Component
public class BeverageRunner implements CommandLineRunner {
	
	@Autowired
	private BeverageRepository repository;
	@Override
	public void run(String... args) throws Exception {
		Beverage b1 = new Beverage();
		b1.setName("black tea");
		b1.setDetail("hot");
		repository.save(b1);
		Beverage b2 = new Beverage();
		b2.setName("green tea");
		b2.setDetail("cool");
		repository.save(b2);
	}

}
