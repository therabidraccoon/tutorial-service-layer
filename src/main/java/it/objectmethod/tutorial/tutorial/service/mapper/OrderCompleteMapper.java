package it.objectmethod.tutorial.tutorial.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.objectmethod.tutorial.tutorial.domain.Order;
import it.objectmethod.tutorial.tutorial.service.dto.OrderCompleteDTO;

@Mapper(componentModel = "spring", uses = { OrderDetailMapper.class })
public interface OrderCompleteMapper extends EntityMapper<OrderCompleteDTO, Order> {

	@Override
	@Mapping(source = "user.id", target = "idUser")
	@Mapping(source = "user.nome", target = "nomeUser")
	@Mapping(source = "user.cognome", target = "cognomeUser")
	OrderCompleteDTO toDto(Order entity);

	@Override
	@Mapping(target = "user", ignore = true)
	Order toEntity(OrderCompleteDTO dto);

}
