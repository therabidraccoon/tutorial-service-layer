package it.objectmethod.tutorial.tutorial.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.objectmethod.tutorial.tutorial.domain.Item;
import it.objectmethod.tutorial.tutorial.domain.Order;
import it.objectmethod.tutorial.tutorial.domain.OrderDetail;
import it.objectmethod.tutorial.tutorial.domain.User;

@Component
public class FakeOrderRepository {

	public Order findById(Long id) {
		Order ord = new Order();
		ord.setId(id);
		ord.setOrderDate(LocalDate.now());

		User u = new User();
		u.setId(id);
		u.setUsername("user" + id);
		u.setNome("Nome" + id);
		u.setCognome("Cognome" + id);
		u.setPassword("12345");
		ord.setUser(u);

		List<OrderDetail> details = new ArrayList<OrderDetail>();
		for (long i = 1; i < 3; i++) {
			OrderDetail det = new OrderDetail();
			det.setId(i);
			det.setQuantity(i * 100);
			Item item = new Item();
			item.setId(i);
			item.setCode("A000" + id);
			item.setDescription("Articolo" + i);
			det.setItem(item);
			details.add(det);
		}

		ord.setRows(details);

		return ord;
	}

	public Order save(Order order) {
		return order;
	}

	public List<Order> findAll() {
		List<Order> orders = new ArrayList<Order>();
		for (long i = 1; i < 5; i++) {
			orders.add(findById(i));
		}
		return orders;
	}
}
