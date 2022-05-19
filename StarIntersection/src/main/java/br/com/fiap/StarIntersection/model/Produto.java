package br.com.fiap.StarIntersection.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="TB_Produto")
public class Produto {
	@Id
	@Column(name="ID_Parceiro")
	private Long id; 
	
	@Column(nullable = false, name="ID_CodigoProduto")
	private Long codigo;
	
	@Column(name="DS_Descricao")
	private String descricao;
	
	@Column(nullable = false, name="ValorUnit")
	private Double valor;
	
	public Produto() {
		
	}

	public Produto(Long id, Long codigo, String descricao, Double valor) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
}
