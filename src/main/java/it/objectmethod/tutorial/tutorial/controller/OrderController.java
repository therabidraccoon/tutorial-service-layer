package it.objectmethod.tutorial.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.tutorial.tutorial.service.OrderService;
import it.objectmethod.tutorial.tutorial.service.dto.OrderCompleteDTO;
import it.objectmethod.tutorial.tutorial.service.dto.OrderDTO;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	@Autowired
	private OrderService ordSrv;

	@GetMapping("/list")
	public List<OrderDTO> findAll() {
		List<OrderDTO> orders = ordSrv.findAll();
		return orders;
	}

	@PutMapping("/save")
	public OrderDTO save(@RequestBody() OrderDTO order) {
		return ordSrv.save(order);
	}

	@GetMapping("/list-complete")
	public List<OrderCompleteDTO> findAllComplete() {
		List<OrderCompleteDTO> orders = ordSrv.findAllComplete();
		return orders;
	}

	@PutMapping("/save-complete")
	public OrderCompleteDTO save(@RequestBody() OrderCompleteDTO order) {
		return ordSrv.save(order);
	}

}
