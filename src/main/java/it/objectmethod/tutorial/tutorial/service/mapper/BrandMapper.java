package it.objectmethod.tutorial.tutorial.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.objectmethod.tutorial.tutorial.domain.BrandEntity;
import it.objectmethod.tutorial.tutorial.service.dto.BrandDTO;

@Mapper(componentModel = "spring", uses= {CarMapper.class})
public interface BrandMapper extends EntityMapper<BrandDTO, BrandEntity> {

	BrandDTO toDto(BrandEntity entity);

	@Mapping(target = "models", ignore = true)
	BrandEntity toEntity(BrandDTO dto);
}
