package de.massisoft.spring.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@javax.persistence.Entity
public class Journal {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private Date created;
	private String summary;
	
	@Transient
	private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	
	public Journal() {}	
	public Journal(String title, String summary, String date) throws ParseException {
		this.title = title;
		this.summary = summary;
		this.created = format.parse(date);
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Date getCreated() {
		return created;
	}

	public String getSummary() {
		return summary;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setFormat(SimpleDateFormat format) {
		this.format = format;
	}
	
	public String getCreatedAsShort() {
		return this.format.format(created);
	}

	@Override
	public String toString() {
		return "Journal [id=" + id + ", title=" + title + ", created=" + created + ", summary=" + summary + ", format="
				+ format + "]";
	}
}
