package ua.java.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.java.models.Result;
import ua.java.models.Test;
import ua.java.models.User;

@Service
public class ResultCalcService implements ResultCalcInterfaceService {

	@Autowired
	private ResultInterfaceService resSer;
	private Test test;
	private User user;
	private int mark = 0;
	private boolean isFinished;
	private Thread timer;
	private int numberQuestions;
	private int correctAnswers;

	public ResultCalcService() {

	}

	public void start(Test test, User user) {
		this.test = test;
		this.user = user;
		numberQuestions = test.getQuestions().size();
		if (test.getTime() != 0) {
			TimerTest timerTest = new TimerTest();
			timerTest.setTime(test.getTime());
			timer = new Thread(new TimerTest());
			timer.start();
		}
	}

	public void markCalculate() {
		if (timer != null) {
			if (timer.isAlive()) {

			}
		} else {

		}
	}

	public void saveResult() {
		if (timer != null) {
			if (timer.isAlive()) {
				resSer.addResult(resultCreate());
			}
		} else {
			resSer.addResult(resultCreate());
		}
	}

	private Result resultCreate() {
		Result result = new Result();
		result.setrTest(test);
		result.setrUser(user);
		result.setMark(mark);
		result.setMinMark(test.getMinSuccessMark());
		if (mark >= test.getMinSuccessMark()) {
			result.setPassed(true);
		}
		return result;
	}

	@Override
	public void setFinished(boolean isFinished) {
		// TODO Auto-generated method stub
		this.isFinished = isFinished;
	}

	@Override
	public boolean getFinished() {
		// TODO Auto-generated method stub
		return isFinished;
	}

	@Override
	public void setTest(Test test) {
		// TODO Auto-generated method stub
		this.test = test;
	}

	@Override
	public Test getTest() {
		// TODO Auto-generated method stub
		return test;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public class TimerTest implements Runnable {
		private long time;
		private LocalDateTime now = LocalDateTime.now();
		private Test test;
		private User user;

		@Override
		public void run() {
			// TODO Auto-generated method stub
			LocalDateTime finish = now.plusMinutes(time);
			while (finish.isBefore(LocalDateTime.now()) || isFinished == false) {

			}
			resSer.addResult(resultCreate());
		}

		public void setTest(Test test) {
			// TODO Auto-generated method stub
			this.test = test;
		}

		public Test getTest() {
			// TODO Auto-generated method stub
			return test;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public void setTime(long time) {
			// TODO Auto-generated method stub
			this.time = time;
		}

		public long getTime() {
			// TODO Auto-generated method stub
			return time;
		}

	}
}
