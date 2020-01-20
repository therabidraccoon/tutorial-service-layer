package it.objectmethod.tutorial.tutorial.service.dto;

import java.util.List;

public class BrandDTO {

	//FAKE ENTITY
	
	private Long id;
	private String brandName;
	private List<CarDTO> models;

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

	public List<CarDTO> getModels() {
		return models;
	}

	public void setModels(List<CarDTO> models) {
		this.models = models;
	}

}
