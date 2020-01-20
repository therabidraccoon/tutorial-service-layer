package it.objectmethod.tutorial.tutorial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.objectmethod.tutorial.tutorial.domain.BrandEntity;
import it.objectmethod.tutorial.tutorial.repository.FakeBrandRepository;
import it.objectmethod.tutorial.tutorial.service.dto.BrandDTO;
import it.objectmethod.tutorial.tutorial.service.mapper.BrandMapper;

@Component
public class BrandService {

	@Autowired
	private FakeBrandRepository brandRepo;

	@Autowired
	private BrandMapper brandMapper;

	public BrandDTO findById(Long id) {
		BrandEntity b = brandRepo.findById(id);
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
