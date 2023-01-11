package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Visit;
import com.nissan.service.IVisitService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class VisitController {
	
	@Autowired
	IVisitService visitServiceImplementation;

	@PostMapping("visits")
	public Visit addNewVisit(@RequestBody Visit _visit) {
		return visitServiceImplementation.addNewVisit(_visit);
	}

	//update a visit
	@PostMapping("updatevisits")
	public Visit updateVisit(@RequestBody Visit _visit) {
		return visitServiceImplementation.updateVisit(_visit);
	}

	//get all visits
	@GetMapping("visits")
	public List<Visit> getAllVisits() {
		return visitServiceImplementation.getAllVisits();
	}

	//delete a visit
	@PutMapping("visits")
	public Visit deleteVisit(@RequestBody Visit _visit) {
		return visitServiceImplementation.deleteVisit(_visit);
	}
}
