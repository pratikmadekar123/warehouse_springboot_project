package com.in.nt.services;

import java.util.List;

import com.in.nt.model.WhUserType;

public interface IWhUserTypeService {
	public List<WhUserType> getAllWhUserType();
	public WhUserType getOneWhUserType(Integer id);
	public WhUserType saveWhUserType(WhUserType userType);
	public void delete(Integer id);
	public WhUserType updateWhUserType(WhUserType userType);

}
