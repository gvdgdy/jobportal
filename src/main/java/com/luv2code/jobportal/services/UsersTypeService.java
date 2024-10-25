package com.luv2code.jobportal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luv2code.jobportal.entity.UsersType;
import com.luv2code.jobportal.repository.*;


@Service
public class UsersTypeService {

	private final  UsersTypeRepository UsersTypeRepository;

	public UsersTypeService(UsersTypeRepository usersTypeRepository) {
		super();
		UsersTypeRepository = usersTypeRepository;
	}
	
	public List<UsersType> getAll()
	{
		return UsersTypeRepository.findAll();
	}
	
	
}
