package ua.java.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "Results")
public class Result {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	@JoinColumn(name = "userId")
	private User rUser;
	private int questions;
	private int correctAnswer;
	private int mark;
	private boolean passed;
	private int minMark;
	@ManyToOne
	@JoinColumn(name = "testId")
	private Test rTest;
	@CreationTimestamp
	private Timestamp createdOn;
	@UpdateTimestamp
	private Timestamp updateDateTime;

	public int getQuestions() {
		return questions;
	}

	public void setQuestions(int questions) {
		this.questions = questions;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public Timestamp getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(Timestamp updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public User getrUser() {
		return rUser;
	}

	public void setrUser(User rUser) {
		this.rUser = rUser;
	}

	public Test getrTest() {
		return rTest;
	}

	public void setrTest(Test rTest) {
		this.rTest = rTest;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public User getUser() {
		return rUser;
	}

	public void setUser(User user) {
		this.rUser = user;
	}

	public Test getTest() {
		return rTest;
	}

	public void setTest(Test qTest) {
		this.rTest = qTest;
	}

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	public int getMinMark() {
		return minMark;
	}

	public void setMinMark(int minMark) {
		this.minMark = minMark;
	}
}
