package it.objectmethod.tutorial.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.objectmethod.tutorial.tutorial.domain.Order;
import it.objectmethod.tutorial.tutorial.domain.User;
import it.objectmethod.tutorial.tutorial.repository.FakeOrderRepository;
import it.objectmethod.tutorial.tutorial.repository.FakeUserRepository;
import it.objectmethod.tutorial.tutorial.service.dto.OrderDTO;
import it.objectmethod.tutorial.tutorial.service.mapper.OrderMapper;

@Component
public class OrderService {

	@Autowired
	private OrderMapper ordMapper;

	@Autowired
	private FakeUserRepository fakeUserRep;

	@Autowired
	private FakeOrderRepository fakeOrdRep;

	public List<OrderDTO> findAll() {
		List<OrderDTO> orderDTOList = null;
		List<Order> orders = fakeOrdRep.findAll();
		orderDTOList = ordMapper.toDto(orders);
		return orderDTOList;
	}

	public OrderDTO save(OrderDTO orderDto) {
		Order order = ordMapper.toEntity(orderDto);
		User user = fakeUserRep.findById(orderDto.getIdUser());
		order.setUser(user);
		order = fakeOrdRep.save(order);
		orderDto = ordMapper.toDto(order);
		return orderDto;
	}

}
