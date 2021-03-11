package it.objectmethod.tutorial.tutorial.service.dto;

import java.time.LocalDate;
import java.util.List;

public class OrderCompleteDTO {

	private Long id;
	private LocalDate orderDate;
	private Long idUser;
	private String nomeUser;
	private String cognomeUser;
	private List<OrderDetailDTO> rows;

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

	public List<OrderDetailDTO> getRows() {
		return rows;
	}

	public void setRows(List<OrderDetailDTO> rows) {
		this.rows = rows;
	}

}
