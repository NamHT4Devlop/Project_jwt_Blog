package com.bezkoder.spring.security.jwt.models;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "advertisement")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Advertisement {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name = "title")
    private String title;

	@Column(name = "description")
    private String description;

	@Column(name = "imageUrl")
    private String imageUrl;

	@Column(name = "url")
    private String url;

	@Column(name = "adPlacement")
    private String adPlacement;

	@Column(name = "startDate")
    private Instant startDate;

	@Column(name = "endDate")
    private Instant endDate;

	@Column(name = "targetAudience")
    private String targetAudience;

	@Column(name = "advertiserName")
    private String advertiserName;

	@Column(name = "advertiserContact")
    private String advertiserContact;

}
