package com.fourcorners.aiq.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.fourcorners.aiq.model.IqaParameters;
import com.fourcorners.aiq.repository.IaqParamsRepository;

@Service
public class IaqParamsService {
	
	@Autowired
    IaqParamsRepository iaqRepository;
	
	//CREATE
	public IqaParameters createParameter(IqaParameters emp) {
	    return iaqRepository.save(emp);
	}
	
	//READ  
	public List<IqaParameters> getParameters() {
	    return iaqRepository.findAll();
	}
	//READ   
	   
	/*
	 * public List<IqaParameters> getDateParameter(Date date) { return
	 * iaqRepository.findByCreatedAtBetween(date); }
	 */
		

	/*
	//UPDATE
	public IqaParameters updateEmployee(long messageID, IqaParameters employeeDetails) {
		IqaParameters emp = empRepository.findById(messageID).get();
		emp.setFirstName(employeeDetails.getFirstName());
		emp.setLastName(employeeDetails.getLastName());
		emp.setEmailId(employeeDetails.getEmailId());
		
		return empRepository.save(emp);				
	}

	//DELETE
	public void deleteEmployee(Long empId) {
	    empRepository.deleteById(empId);
	}  */
}

