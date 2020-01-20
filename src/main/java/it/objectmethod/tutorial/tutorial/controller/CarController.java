package it.objectmethod.tutorial.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.tutorial.tutorial.service.CarService;
import it.objectmethod.tutorial.tutorial.service.dto.CarDTO;

@RestController
@RequestMapping("/api/car")
public class CarController {

	@Autowired
	public CarService carService;

	@GetMapping("/{id}/find")
	public CarDTO findOne(@PathVariable("id") Long idCar) {
		System.out.println("Chiamato car controller: " + idCar);
		return carService.findById(idCar);
	}
	
	@GetMapping("/find-all")
	public List<CarDTO> findAll() {
		return carService.findAll();
	}

}
