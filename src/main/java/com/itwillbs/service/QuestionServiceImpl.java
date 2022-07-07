package com.itwillbs.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.itwillbs.dao.QuestionDAO;
import com.itwillbs.domain.CityDTO;
import com.itwillbs.domain.QuestionDTO;
import com.itwillbs.domain.ServiceDTO;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Inject
	private QuestionDAO questionDAO;
	
	@Override
	public List<String> getQuestions(int services_id) {
		
		return questionDAO.getQuestions(services_id);
	}

	@Override
	public List<Integer> getQuestions_id(int services_id) {
		
		return questionDAO.getQuestions_id(services_id);
	}

	@Override
	public List<String> getAnswers(int questions_id) {
		
		return questionDAO.getAnswers(questions_id);
	}

	@Override
	public ServiceDTO getServiceName(int services_id) {
		
		return questionDAO.getServiceName(services_id);
	}

	@Override
	public List<String> getCities() {
		
		return questionDAO.getCities();
	}
	
	
	
	

}
