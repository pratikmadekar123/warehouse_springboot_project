package com.in.nt.services;

import java.util.List;

import com.in.nt.model.Uom;

public interface IUomService {

	public List<Uom> getAllUom();
	public Uom saveUom(Uom uom);
	public Uom getUomById(Integer id);
	public Uom updateUom(Uom uom);
	public void deleteUom(Integer id);
	
}
