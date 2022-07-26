package com.in.nt.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.nt.model.Part;
import com.in.nt.repository.IPartRepository;
import com.in.nt.services.IPartService;

@Service
public class PartServiceImpl implements IPartService {
	@Autowired
	private IPartRepository partRepo;
	
	@Transactional
	public List<Part> getAllPart() {
		// TODO Auto-generated method stub
		return partRepo.findAll();
	}

	@Transactional
	public Part savePart(Part part) {
		// TODO Auto-generated method stub
		return partRepo.save(part);
	}

	@Transactional
	public void deletePart(Integer id) {
		partRepo.deleteById(id);

	}

	@Transactional
	public Part updatePart(Part part) {
		
		return partRepo.save(part);

	}

	@Transactional
	public Part getOnePart(Integer id) {
		// TODO Auto-generated method stub
		return partRepo.findById(id).get();
	}

}
