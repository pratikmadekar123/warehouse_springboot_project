package com.in.nt.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.nt.model.WhUserType;
import com.in.nt.repository.IWhUserTypeRepo;
import com.in.nt.services.IWhUserTypeService;
@Service
public class WhUserTypeServiceImpl implements IWhUserTypeService {

	@Autowired
	private IWhUserTypeRepo whUser;
	
	@Transactional
	public List<WhUserType> getAllWhUserType() {
		return whUser.findAll();
	}

	@Transactional
	public WhUserType getOneWhUserType(Integer id) {
		// TODO Auto-generated method stub
		return whUser.findById(id).get();
	}

	@Transactional
	public WhUserType saveWhUserType(WhUserType userType) {
		// TODO Auto-generated method stub
		return whUser.save(userType);
	}

	@Transactional
	public void delete(Integer id) {
		whUser.deleteById(id);
		
	}

	@Transactional
	public WhUserType updateWhUserType(WhUserType userType) {
		// TODO Auto-generated method stub
		return whUser.save(userType);
	}

}
