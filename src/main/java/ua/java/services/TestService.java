package ua.java.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ua.java.models.Answer;
import ua.java.models.Question;
import ua.java.models.Test;
import ua.java.models.User;
import ua.java.repository.TestRepository;

@Service
public class TestService implements TestInterfaceService {

	@Autowired
	@Qualifier(value = "TestRepository")
	private TestRepository testRepository;

	@Autowired
	private QuestionInterfaceService questionServ;

	@Autowired
	private AnswerInterfaceService answerServ;

	@Override
	public Test addTest(Test t) {
		// TODO Auto-generated method stub
		this.testRepository.save(t);
		return t;
	}

	@Override
	public void updateTest(Test t) {
		// TODO Auto-generated method stub
		this.testRepository.save(t);
	}

	@Override
	public List<Test> listTests() {
		// TODO Auto-generated method stub
		return this.testRepository.findAll();
	}

	@Override
	public Test getTestById(Long id) {
		return this.testRepository.findOne(id);
	}

	@Override
	public void removeTest(long id) {
		// TODO Auto-generated method stub
		this.testRepository.delete(id);
	}

	public Test addQuestion(Question question, long testId) {
		// TODO Auto-generated method stub
		question.setqTest(testRepository.getTestById(testId));
		questionServ.addQuestion(question);
		return getFullTestById(testId);
	}

	@Override
	@Transactional
	public List<Question> getListQuestionsById(long id) {
		Test test = testRepository.getOne(id);
		List<Question> list = test.getQuestions();
		return list;
	}

	@Override
	public Test getFullTestById(long id) {
		// TODO Auto-generated method stub
		Test test = this.getTestById(id);
		List<Question> list = questionServ.getListByTest(test);
		for (Question q : list) {
			List<Answer> listAnsw = answerServ.getListByQuestion(q);
			q.setAnswers(listAnsw);
		}
		test.setQuestions(list);
		return test;
	}

	@Override
	public List<Test> findAllByAuthorId(User user) {
		return testRepository.getListTestsBytAuthor(user);
	}
}
