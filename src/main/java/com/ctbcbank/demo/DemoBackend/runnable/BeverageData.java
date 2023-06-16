package com.ctbcbank.demo.DemoBackend.runnable;

import com.ctbcbank.demo.DemoBackend.entity.Beverage;
import com.ctbcbank.demo.DemoBackend.repository.BeverageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BeverageData implements CommandLineRunner {

    @Autowired
    private BeverageRepository beverageRepository;

    @Override
    public void run(String... args) throws Exception {
        addData();
    }

    private void addData() {
        Beverage b1 = new Beverage();
        b1.setName("milk tea");

        beverageRepository.save(b1);
    }


}
