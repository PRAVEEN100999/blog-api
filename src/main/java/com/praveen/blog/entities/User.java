package com.praveen.blog.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// used to tell spring that it is a entity
@Entity
// if we wanna change table name 
@Table(name = "users")
@NoArgsConstructor
// for not creating any getter setter
@Getter
@Setter
public class User {
	// for declaring primary key 
	@Id
	//for auto increment 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	// for giving some extra info
	@Column(name = "user_name", nullable = false, length = 100)
	private String name;
	private String email;
	private String password;
	private String about;
	
}
