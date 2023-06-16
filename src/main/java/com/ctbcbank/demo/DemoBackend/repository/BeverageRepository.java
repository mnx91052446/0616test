package com.ctbcbank.demo.DemoBackend.repository;

import org.springframework.data.repository.CrudRepository;

import com.ctbcbank.demo.DemoBackend.entity.Beverage;

public interface BeverageRepository extends CrudRepository<Beverage, Long> {

}
