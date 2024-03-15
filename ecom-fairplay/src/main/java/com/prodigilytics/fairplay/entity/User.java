package com.prodigilytics.fairplay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;
import com.prodigilytics.fairplay.enums.UserRole;

@Entity
@Table
@Data
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String email;
	
	private String password;
	
	private String name;
	
	private UserRole role;
	
	@Lob
	@Column(columnDefinition="Longblob")
	private byte[] img;

}
