package com.in.nt.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.nt.model.Uom;
import com.in.nt.repository.UomRepository;
import com.in.nt.services.IUomService;

@Service
public class UomServiceImpl implements IUomService {
	
	@Autowired
	private UomRepository repo;

	
	public UomServiceImpl(UomRepository repo) {
		super();
		this.repo = repo;
	}

	@Transactional
	public List<Uom> getAllUom() {
		return repo.findAll();
	}

	@Transactional
	public Uom saveUom(Uom uom) {
		// TODO Auto-generated method stub
		
		return repo.save(uom);
	}

	@Transactional
	public Uom getUomById(Integer id) {
		// TODO Auto-generated method stub
		return  repo.findById(id).get();
	}

	@Transactional
	public Uom updateUom(Uom uom) {
		// TODO Auto-generated method stub
		
		return repo.save(uom);	}

	@Transactional
	public void deleteUom(Integer id) {
		repo.deleteById(id);
	}
	
	

}
