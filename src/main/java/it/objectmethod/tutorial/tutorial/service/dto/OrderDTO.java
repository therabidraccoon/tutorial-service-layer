package it.objectmethod.tutorial.tutorial.service.dto;

import java.time.LocalDate;

public class OrderDTO {

	private Long id;
	private LocalDate orderDate;
	private Long idUser;
	private String nomeUser;
	private String cognomeUser;

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

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getNomeUser() {
		return nomeUser;
	}

	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}

	public String getCognomeUser() {
		return cognomeUser;
	}

	public void setCognomeUser(String cognomeUser) {
		this.cognomeUser = cognomeUser;
	}

}
