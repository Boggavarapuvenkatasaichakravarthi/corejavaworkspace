package com.kani.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo")
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="done")
	private boolean done;
	

	public Task() {}


	public Task(String title, String description, boolean done) {
		this.title = title;
		this.description = description;
		this.done = done;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isDone() {
		return done;
	}


	public void setDone(boolean done) {
		this.done = done;
	}


	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", description=" + description + ", done=" + done + "]";
	}

	
}
