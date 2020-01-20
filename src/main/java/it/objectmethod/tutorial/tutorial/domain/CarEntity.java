package it.objectmethod.tutorial.tutorial.domain;

public class CarEntity {
	
	//FAKE ENTITY
	private Long id;
	private String modelName;
	private BrandEntity brand;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public BrandEntity getBrand() {
		return brand;
	}

	public void setBrand(BrandEntity brand) {
		this.brand = brand;
	}

}
