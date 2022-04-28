package com.fourcorners.aiq.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fourcorners.aiq.model.IqaParameters;
import com.fourcorners.aiq.service.IaqParamsService;

@RestController
@RequestMapping("/api")
public class IaqController {
	@Autowired
	IaqParamsService parametersService;
	/*
	@RequestMapping(value="/employees", method=RequestMethod.POST)
	public IqaParameters createEmployee(@RequestBody IqaParameters emp) {
	    return parametersService.createEmployee(emp);
	}*/

	@RequestMapping(value="/iaqparameters", method=RequestMethod.GET)
	public List<IqaParameters> readParameter() {
	    return parametersService.getParameters();
	}
	/*
	@RequestMapping(value="/iaqparameters/{date}", method=RequestMethod.PUT)
	public Date readParameterDate(@PathVariable(value = "empId") Long id, @RequestBody IqaParameters paramDetails) {
	    return ((Object) parametersService).findByCreatedAtBetween(paramDetails);   
	}   
	
	@RequestMapping(value="/employees/{empId}", method=RequestMethod.PUT)
	public IqaParameters updateEmployee(@PathVariable(value = "empId") Long id, @RequestBody IqaParameters empDetails) {
	    return parametersService.updateEmployee(id, empDetails);
	}
	
	@RequestMapping(value="/employees/{empId}", method=RequestMethod.DELETE)
	public void deleteEmployees(@PathVariable(value = "empId") Long id) {
		parametersService.deleteEmployee(id);
	}*/
}



