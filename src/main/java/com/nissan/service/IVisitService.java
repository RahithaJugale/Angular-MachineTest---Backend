package com.nissan.service;

import java.util.List;

import com.nissan.model.Visit;

public interface IVisitService {

	//add new visit
	Visit addNewVisit(Visit _visit);
	
	//update visit
	Visit updateVisit(Visit _visit);
	
	//getAllVisits
	List<Visit> getAllVisits();
	
	//delete a visit
	Visit deleteVisit(Visit _visit);
}
