package it.objectmethod.tutorial.tutorial.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.objectmethod.tutorial.tutorial.domain.OrderDetail;
import it.objectmethod.tutorial.tutorial.service.dto.OrderDetailDTO;

@Mapper(componentModel = "spring")
public interface OrderDetailMapper extends EntityMapper<OrderDetailDTO, OrderDetail> {

	@Override
	@Mapping(source = "item.id", target = "itemId")
	@Mapping(source = "item.description", target = "itemDesc")
	OrderDetailDTO toDto(OrderDetail entity);

	@Override
	@Mapping(target = "item", ignore = true)
	OrderDetail toEntity(OrderDetailDTO dto);

}
