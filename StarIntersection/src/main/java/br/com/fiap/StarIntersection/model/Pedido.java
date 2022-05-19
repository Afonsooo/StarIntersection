package br.com.fiap.StarIntersection.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="TB_Pedido")
public class Pedido {
	@Id
	@Column(name="ID_Parceiro")
	private Long id; 
	
	@Column(nullable = false, name="DT_Periodo")
	private LocalDate periodo;
	
	@Column(nullable = false, name="ID_CodigoProduto")
	private Long codigoProduto;
	
	@Column(nullable = false, name="DATA_COMPRA")
	private LocalDate dataCompra;
	
	@Column(nullable = false, name="ChaveNFe")
	private Long chaveNF;
	
	@Column(nullable = false, name="NUM_ITEM")
	private Long numItem;
	
	@Column(nullable = false, name="CHASSI")
	private String chassi;
	
	@Column(nullable = false, name="QTD")
	private Long quantidade;
	
	@Column(nullable = false, name="ValorUnit")
	private Double valorUnit;
	
	@Column(nullable = false, name="ValorProduto")
	private Double valorProduto;
	
	@Column(nullable = false, name="ID_Parceiro1")
	private Long idParceiroForeign;

	public Pedido() {
	
	}
	
	public Pedido(Long id, LocalDate periodo, Long codigoProduto, LocalDate dataCompra, Long chaveNF, Long numItem,
			String chassi, Long quantidade, Double valorUnit, Double valorProduto, Long idParceiroForeign) {
		super();
		this.id = id;
		this.periodo = periodo;
		this.codigoProduto = codigoProduto;
		this.dataCompra = dataCompra;
		this.chaveNF = chaveNF;
		this.numItem = numItem;
		this.chassi = chassi;
		this.quantidade = quantidade;
		this.valorUnit = valorUnit;
		this.valorProduto = valorProduto;
		this.idParceiroForeign = idParceiroForeign;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getPeriodo() {
		return periodo;
	}

	public void setPeriodo(LocalDate periodo) {
		this.periodo = periodo;
	}

	public Long getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(Long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Long getChaveNF() {
		return chaveNF;
	}

	public void setChaveNF(Long chaveNF) {
		this.chaveNF = chaveNF;
	}

	public Long getNumItem() {
		return numItem;
	}

	public void setNumItem(Long numItem) {
		this.numItem = numItem;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(Double valorUnit) {
		this.valorUnit = valorUnit;
	}

	public Double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Long getIdParceiroForeign() {
		return idParceiroForeign;
	}

	public void setIdParceiroForeign(Long idParceiroForeign) {
		this.idParceiroForeign = idParceiroForeign;
	}
	
	
	
	
	
	
	
}
