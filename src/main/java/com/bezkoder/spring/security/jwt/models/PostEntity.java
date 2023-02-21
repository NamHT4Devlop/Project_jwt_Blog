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
@Table(name = "posts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "content")
	private String content;

	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "keywords")
	private String keywords;

	@Column(name = "tags")
	private String tags;

	@Column(name = "author")
	private String author;

	@Column(name = "publishDate")
	private Instant publishDate;

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "updateDate")
	private Instant updateDate;

	@Column(name = "deleteDate")
	private Instant deleteDate;
}
