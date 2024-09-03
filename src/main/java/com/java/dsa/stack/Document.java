package com.java.dsa.stack;

import java.util.Date;

public class Document {
	
	private String title;
	private String content;
	private String author;
	private int version;
	private Date createdDate;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "Document [title=" + title + ", content=" + content + ", author=" + author + ", version=" + version
				+ ", createdDate=" + createdDate + "]";
	}
	public Document(String title, String content, String author, int version) {
		super();
		this.title = title;
		this.content = content;
		this.author = author;
		this.version = version;
		this.createdDate = new Date();
	}
	public Document() {
		
	}
	
	
}
