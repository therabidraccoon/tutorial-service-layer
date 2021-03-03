package it.objectmethod.tutorial.tutorial.domain;

import java.time.LocalDate;
import java.util.List;

//Entity
public class Order {

	private Long id;
	private LocalDate orderDate;
	private User user;
	private List<OrderDetail> rows;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderDetail> getRows() {
		return rows;
	}

	public void setRows(List<OrderDetail> rows) {
		this.rows = rows;
	}

}
