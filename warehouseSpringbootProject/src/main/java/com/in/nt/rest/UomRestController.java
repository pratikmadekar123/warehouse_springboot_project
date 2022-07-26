package com.in.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.nt.model.Uom;
import com.in.nt.services.IUomService;

@RestController
@RequestMapping("/rest/uom/")
public class UomRestController {

	@Autowired
	private IUomService uomService;

	@GetMapping("/all")
	public ResponseEntity<?> getAllUom(){
		ResponseEntity<?> resp;
		try {
			List<Uom> list = uomService.getAllUom();
			if(list!=null && !list.isEmpty()) {
				resp = new ResponseEntity<List<Uom>>(list, HttpStatus.OK);
			}else {
				resp = new ResponseEntity<String>("No Record Found",HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			resp = new ResponseEntity<String>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<?> fetchOneUom(@PathVariable("id") Integer id){
		ResponseEntity<?> resp;
		try {
			Uom uom = uomService.getUomById(id);
			if(uom!=null) {
				resp = new ResponseEntity<Uom>(uom, HttpStatus.OK);
			}else {
				resp = new ResponseEntity<String>("No Data Found",(HttpStatus.NO_CONTENT));
			}
		}catch(Exception e) {
			resp = new ResponseEntity<String>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}

	@PostMapping("/save")
	public ResponseEntity<?> saveUom(@RequestBody Uom uom){

		ResponseEntity<?> resp;
		uomService.saveUom(uom);
		try {
			resp =  new ResponseEntity<String>("Uom regiestered with "+uom.getUomId(),HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<String>("Internal Server Error",HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return resp;
	}

	@PostMapping("/update/{id}")
	public ResponseEntity<?> updateUom(@RequestBody Uom uom,@PathVariable("id") Integer id){
		ResponseEntity<?> resp = null ;
		Uom oldUom =null;
		try {
			oldUom = uomService.getUomById(id);
			oldUom.setUomId(id);
			oldUom.setUomModel(uom.getUomModel());
			oldUom.setUomType(uom.getUomType());
			oldUom.setUomDesc(uom.getUomDesc());
			if(oldUom!=null){
				uomService.updateUom(oldUom);
				resp = new ResponseEntity<String>("Uom "+oldUom.getUomId()+" updated Succefully",HttpStatus.OK);
			}

		} catch (Exception e) {
			resp = new ResponseEntity<String>("Internal Server Error",HttpStatus.OK);
		}
		return resp;
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteUom(@PathVariable("id") Integer id){
		ResponseEntity<?> resp=null;
		try {
			uomService.deleteUom(id);
			resp = new ResponseEntity<String>("Uom "+id+" deleted",HttpStatus.OK);

		} catch (Exception e) {
			resp = new ResponseEntity<String>("Internal Server Error",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;

	}
}
