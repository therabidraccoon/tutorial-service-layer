package it.objectmethod.tutorial.tutorial.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.objectmethod.tutorial.tutorial.domain.CarEntity;
import it.objectmethod.tutorial.tutorial.service.dto.CarDTO;

@Mapper(componentModel = "spring")
public interface CarMapper extends EntityMapper<CarDTO, CarEntity> {

	@Mapping(source="brand.id", target="brandId")
	@Mapping(source="brand.brandName", target="brandName")
	CarDTO toDto(CarEntity entity);

	@Mapping(target = "brand", ignore = true)
	CarEntity toEntity(CarDTO dto);
	
	List<CarDTO> toDto(List<CarEntity> entityList);
}
