package com.xworkz.spring.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dao.ValentineDAO;
import com.xworkz.spring.entity.ValentineServiceEntity;

@Component
public class ValentineServiceImpl implements ValentineService {
	
	@Autowired
	private ValentineDAO dao;
	
	public ValentineServiceImpl() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}

	public boolean validateAndSave(ValentineServiceEntity entity) {
		System.out.println("invoked ValidateAndSave"+entity);
		System.out.println("yet to validate");
		Integer id=dao.save(entity);
		if(Objects.nonNull(id)) {
			System.out.println("entity saved");
			return true;
		}
		return false;
	}
}

