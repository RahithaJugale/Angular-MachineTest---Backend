package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.Visit;
import com.nissan.repo.IVisitRepository;


@Service
public class VisitServiceImplementation implements IVisitService {

	@Autowired
	IVisitRepository visitRepository;
	
	//add new visit
	@Override
	@Transactional
	public Visit addNewVisit(Visit _visit) {
		return visitRepository.save(_visit);
	}

	//update a visit
	@Override
	@Transactional
	public Visit updateVisit(Visit _visit) {
		return visitRepository.save(_visit);
	}

	//get all visits
	@Override
	public List<Visit> getAllVisits() {
		return visitRepository.findAll();
	}

	//delete a visit
	@Override
	@Transactional
	public Visit deleteVisit(Visit _visit) {
		_visit.setIsDeleted(true);
		return visitRepository.save(_visit);
	}

}
