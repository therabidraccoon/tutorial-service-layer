package it.objectmethod.tutorial.tutorial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import it.objectmethod.tutorial.tutorial.domain.BrandEntity;
import it.objectmethod.tutorial.tutorial.repository.FakeBrandRepository;
import it.objectmethod.tutorial.tutorial.service.dto.BrandDTO;
import it.objectmethod.tutorial.tutorial.service.mapper.BrandMapper;
import it.objectmethod.tutorial.tutorial.validators.BrandValidator;

@Component
public class BrandService {

	@Autowired
	private BrandValidator validator;
	
	@Autowired
	private FakeBrandRepository brandRepo;

	@Autowired
	private BrandMapper brandMapper;

	public BrandDTO findById(Long id) {
		BrandEntity b = brandRepo.findById(id);
		List<String> errors = validator.validateBrand(b);
		if(!errors.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, errors.toString());
		}
		BrandDTO brand = brandMapper.toDto(b);
		return brand;
	}

	public List<BrandDTO> findAll() {
		List<BrandEntity> list = brandRepo.findAll();
		List<BrandDTO> dtos = new ArrayList<BrandDTO>();
		for (BrandEntity e : list) {
			BrandDTO brand = brandMapper.toDto(e);
			dtos.add(brand);
		}
		return dtos;
	}
}
