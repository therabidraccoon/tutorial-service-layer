package it.objectmethod.tutorial.tutorial.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.objectmethod.tutorial.tutorial.domain.BrandEntity;
import it.objectmethod.tutorial.tutorial.domain.CarEntity;

@Component
public class FakeBrandRepository {
	
	public BrandEntity findById(Long id) {
		
		BrandEntity brand = new BrandEntity();
		brand.setId(id);
		brand.setBrandName("Mer");
		brand.setModels(new ArrayList<CarEntity>());
		
		for(long i = 0; i<3; i++) {
			CarEntity car = new CarEntity();
			car.setId(i);
			car.setModelName("Punto");
			car.setBrand(brand);
			brand.getModels().add(car);
		}
		return brand;
	}
	
	
	public List<BrandEntity> findAll() {
		List<BrandEntity> list = new ArrayList<BrandEntity>();
		for(long i = 0; i<3; i++) {
			list.add(findById(i));
		}
		return list;
	}

}
