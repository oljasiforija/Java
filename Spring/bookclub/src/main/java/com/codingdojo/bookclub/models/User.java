package com.codingdojo.bookclub.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(min=2, max=25)
	private String firstName;
	@NotEmpty
	@Size(min=2, max=25)
	private String lastName;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	@Size(min = 8, max = 128)
	private String password;
	@Transient
	@NotEmpty
	@Size(min = 8, max = 128)
	private String passwordConfirm;
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updateatAt;
	
	@OneToMany(mappedBy = "user", fetch=FetchType.LAZY)
	private List <Book> books;
	
	public User() {}

	public User(@NotEmpty @Size(min = 2, max = 25) String firstName, @NotEmpty @Size(min = 2, max = 25) String lastName,
			@NotEmpty @Email String email, @NotEmpty @Size(min = 8, max = 128) String password,
			@NotEmpty @Size(min = 8, max = 128) String passwordConfirm) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdateatAt() {
		return updateatAt;
	}

	public void setUpdateatAt(Date updateatAt) {
		this.updateatAt = updateatAt;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updateatAt = new Date();
	}

}
