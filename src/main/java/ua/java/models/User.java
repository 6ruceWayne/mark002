package ua.java.models;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String username;
	private String password;
	private String passwordConfirm;
	@OneToMany(mappedBy = "tAuthor", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	private List<Test> listTests = new ArrayList<Test>();
	@ManyToMany
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;
	@OneToMany(mappedBy = "rUser", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	private List<Result> result = new ArrayList<Result>();
	@CreationTimestamp
	private Timestamp dateRegistration;

	public List<Test> getListTests() {
		return listTests;
	}

	public void setListTests(List<Test> listTests) {
		this.listTests = listTests;
	}

	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getDateRegistration() {
		return dateRegistration;
	}

	public void setDateRegistration(Timestamp dateRegistration) {
		this.dateRegistration = dateRegistration;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Transient
	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return username;
	}
}
