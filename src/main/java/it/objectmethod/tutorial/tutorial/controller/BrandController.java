package it.objectmethod.tutorial.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.tutorial.tutorial.service.BrandService;
import it.objectmethod.tutorial.tutorial.service.dto.BrandDTO;

@RestController
@RequestMapping("/api/brand")
public class BrandController {

	@Autowired
	public BrandService brandService;

	@GetMapping("/{id}/find")
	public BrandDTO findOne(@PathVariable("id") Long id) {
		return brandService.findById(id);
	}

	@GetMapping("/find-all")
	public List<BrandDTO> findAll() {
		return brandService.findAll();
	}

}
