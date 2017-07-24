package ua.java.models;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "Questions")
public class Question {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "question",columnDefinition = "TEXT")
	private String text;
	@ManyToOne
	@JoinColumn(name = "testId")
	private Test qTest;
	@OneToMany(mappedBy = "aQuestion", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	private List<Answer> answers = new ArrayList<Answer>();
	private int priceQuestion;
	private String reasonWhy;
	@CreationTimestamp
	private Timestamp createdOn;
	@UpdateTimestamp
	private Timestamp updateDateTime;

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

	public Question() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Test getqTest() {
		return qTest;
	}

	public void setqTest(Test qTest) {
		this.qTest = qTest;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + text + ", qTest=" + qTest + ", answers=" + answers + "]";
	}

	public int getPriceQuestion() {
		return priceQuestion;
	}

	public void setPriceQuestion(int priceQuestion) {
		this.priceQuestion = priceQuestion;
	}

	public String getReasonWhy() {
		return reasonWhy;
	}

	public void setReasonWhy(String reasonWhy) {
		this.reasonWhy = reasonWhy;
	}
}
