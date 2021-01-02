package com.hg.crud.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")
public class TodoDTO {

	@Id
	private String _id;
	
	private String name;

	private String description;

	private LocalDate createdAt;

	public String get_id() {
		return _id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

}
