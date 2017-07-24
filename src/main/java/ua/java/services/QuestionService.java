package ua.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.java.models.Question;
import ua.java.models.Test;
import ua.java.repository.QuestionRepository;

@Service
public class QuestionService implements QuestionInterfaceService {

	@Autowired
	private QuestionRepository questionRep;

	@Override
	public void addQuestion(Question q) {
		// TODO Auto-generated method stub
		this.questionRep.save(q);
	}

	@Override
	public void updateQuestion(Question q) {
		// TODO Auto-generated method stub
		this.questionRep.save(q);
	}

	@Override
	public List<Question> listQuestions() {
		// TODO Auto-generated method stub
		return this.questionRep.findAll();
	}

	@Override
	public Question getQuestionById(long id) {
		// TODO Auto-generated method stub
		Question question = questionRep.findOne(id);
		return question;
	}

	@Override
	public void removeQuestion(long id) {
		// TODO Auto-generated method stub
		this.questionRep.delete(id);
	}

	@Override
	public List<Question> getListById(long id) {
		// TODO Auto-generated method stub
		return questionRep.findAllById(id);
	}

	@Override
	public List<Question> getListByTest(Test id) {
		return questionRep.findByTest(id);
	}

}
