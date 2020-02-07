package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.entity.ValentineServiceEntity;
import com.xworkz.spring.service.ValentineService;

public class ServiceTester {

	public static void main(String[] args) {
		
		try {
			
			ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
			ValentineService service = container.getBean(ValentineService.class);
		
			ValentineServiceEntity entity = new ValentineServiceEntity();
			entity.setName("Eshwar");
			entity.setAmountSpent(420);
			entity.setStatus("double");
			entity.setGift("Heart");
			
			service.validateAndSave(entity);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
