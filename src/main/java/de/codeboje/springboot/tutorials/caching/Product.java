package de.codeboje.springboot.tutorials.caching;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String ean;
	private String name;

	public Product() {
		super();
	}

	public Product(String id, String ean, String name) {
		super();
		this.id = id;
		this.ean = ean;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
