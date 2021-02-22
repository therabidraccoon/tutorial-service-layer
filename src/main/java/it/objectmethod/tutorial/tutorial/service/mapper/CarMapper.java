package it.objectmethod.tutorial.tutorial.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.objectmethod.tutorial.tutorial.domain.CarEntity;
import it.objectmethod.tutorial.tutorial.service.dto.CarDTO;

@Mapper(componentModel = "spring")
public interface CarMapper extends EntityMapper<CarDTO, CarEntity> {

	@Override
	@Mapping(source = "brand.id", target = "brandId")
	@Mapping(source = "brand.brandName", target = "brandName")
	CarDTO toDto(CarEntity entity);

	@Override
	@Mapping(target = "brand", ignore = true)
	CarEntity toEntity(CarDTO dto);

}
