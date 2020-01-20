package it.objectmethod.tutorial.tutorial.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.objectmethod.tutorial.tutorial.domain.BrandEntity;
import it.objectmethod.tutorial.tutorial.domain.CarEntity;

@Component
public class FakeCarRepository {
	
	public CarEntity findById(Long id) {
		CarEntity car = new CarEntity();
		car.setId(id);
		car.setModelName("Punto");
		
		BrandEntity brand = new BrandEntity();
		brand.setId(1L);
		brand.setBrandName("Fiat");
		car.setBrand(brand);
		return car;
	}
	
	
	public List<CarEntity> findAll() {
		List<CarEntity> list = new ArrayList<CarEntity>();
		for(long i = 0; i<3; i++) {
			list.add(findById(i));
		}
		return list;
	}

}
