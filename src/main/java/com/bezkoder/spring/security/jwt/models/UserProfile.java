package com.bezkoder.spring.security.jwt.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "userprofile")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne(mappedBy = "userProfile")
    private User user;
	private String fullName;
	private String avatar;
	private String phone;
	private String address;
	private String job;
	private String education;
	private String experience;
	private String skills;
	private String interests;
	private String gender;
	private String birthdate;
	private String introduction;
	private String socialMedia;
}
