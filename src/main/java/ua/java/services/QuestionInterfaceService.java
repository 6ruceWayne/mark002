package ua.java.services;

import java.util.List;

import ua.java.models.Question;
import ua.java.models.Test;

public interface QuestionInterfaceService {
	public void addQuestion(Question q);

	public void updateQuestion(Question q);

	public List<Question> listQuestions();

	public Question getQuestionById(long id);

	public void removeQuestion(long id);

	public List<Question> getListById(long id);

	public List<Question> getListByTest(Test id);
}
