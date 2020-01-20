package it.objectmethod.tutorial.tutorial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.objectmethod.tutorial.tutorial.domain.CarEntity;
import it.objectmethod.tutorial.tutorial.repository.FakeCarRepository;
import it.objectmethod.tutorial.tutorial.service.dto.CarDTO;
import it.objectmethod.tutorial.tutorial.service.mapper.CarMapper;

@Component
public class CarService {

	@Autowired
	private FakeCarRepository carRepo;

	@Autowired
	private CarMapper carMapper;

	public CarDTO findById(Long id) {
		CarEntity c = carRepo.findById(id);
		CarDTO car = carMapper.toDto(c);
		return car;
	}

	public List<CarDTO> findAll() {
		List<CarEntity> list = carRepo.findAll();
		List<CarDTO> dtos = carMapper.toDto(list);
//		for (CarEntity e : list) {
//			CarDTO car = carMapper.toDto(e);
//			dtos.add(car);
//		}
		return dtos;
	}

}
