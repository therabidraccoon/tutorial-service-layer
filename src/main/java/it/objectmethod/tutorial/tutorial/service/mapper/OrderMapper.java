package it.objectmethod.tutorial.tutorial.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.objectmethod.tutorial.tutorial.domain.Order;
import it.objectmethod.tutorial.tutorial.service.dto.OrderDTO;

@Mapper(componentModel = "spring")
public interface OrderMapper extends EntityMapper<OrderDTO, Order> {

	@Override
	@Mapping(source = "user.id", target = "idUser")
	@Mapping(source = "user.nome", target = "nomeUser")
	@Mapping(source = "user.cognome", target = "cognomeUser")
	OrderDTO toDto(Order entity);

	@Override
	@Mapping(target = "user", ignore = true)
	@Mapping(target = "rows", ignore = true)
	Order toEntity(OrderDTO dto);

}
