package it.objectmethod.tutorial.tutorial.domain;

import java.util.List;

public class BrandEntity {

	//FAKE ENTITY
	
	private Long id;
	private String brandName;
	private List<CarEntity> models;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<CarEntity> getModels() {
		return models;
	}

	public void setModels(List<CarEntity> models) {
		this.models = models;
	}

}
