package ua.java.services;

import java.sql.Timestamp;
import java.util.List;

import ua.java.models.Result;
import ua.java.models.Test;
import ua.java.models.User;

public interface ResultInterfaceService {
	public List<Result> findAllByTestId(Test qTest);

	public List<Result> findAllByUserId(User user);

	public void addResult(Result result);

	public Result findBycreatedOn(Timestamp createdOn);
}
