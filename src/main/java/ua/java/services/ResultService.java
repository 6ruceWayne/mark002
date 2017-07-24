package ua.java.services;

import java.sql.Timestamp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.java.models.Result;
import ua.java.models.Test;
import ua.java.models.User;
import ua.java.repository.ResultRepository;

@Service
public class ResultService implements ResultInterfaceService {
	@Autowired
	private ResultRepository resRep;

	@Override
	public List<Result> findAllByTestId(Test qTest) {
		// TODO Auto-generated method stub
		return resRep.findAllByTestId(qTest);
	}

	@Override
	public List<Result> findAllByUserId(User user) {
		// TODO Auto-generated method stub
		return resRep.findAllByUserId(user);
	}

	@Override
	@Transactional
	public void addResult(Result result) {
		// TODO Auto-generated method stub
		try {
			Result findedResult = resRep.findBycreatedOn(result.getCreatedOn());
		} catch (NullPointerException e) {
			resRep.save(result);
		}
	}

	@Override
	public Result findBycreatedOn(Timestamp createdOn) {
		// TODO Auto-generated method stub
		return resRep.findBycreatedOn(createdOn);
	}

}
