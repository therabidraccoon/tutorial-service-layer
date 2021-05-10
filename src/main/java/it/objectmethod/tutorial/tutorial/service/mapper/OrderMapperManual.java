package it.objectmethod.tutorial.tutorial.service.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.objectmethod.tutorial.tutorial.domain.Order;
import it.objectmethod.tutorial.tutorial.service.dto.OrderDTO;

@Component
public class OrderMapperManual implements EntityMapper<OrderDTO, Order> {

	@Override
	public Order toEntity(OrderDTO dto) {
		Order entity = new Order();
		entity.setId(dto.getId());
		entity.setOrderDate(dto.getOrderDate());
		// TODO non completo, solo a fini di spiegazione
		return entity;
	}

	@Override
	public OrderDTO toDto(Order entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> toEntity(List<OrderDTO> dtoList) {
		List<Order> orderList = new ArrayList<Order>();
		for (OrderDTO dto : dtoList) {
			Order order = toEntity(dto);
			orderList.add(order);
		}
		return orderList;
	}

	@Override
	public List<OrderDTO> toDto(List<Order> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

}
