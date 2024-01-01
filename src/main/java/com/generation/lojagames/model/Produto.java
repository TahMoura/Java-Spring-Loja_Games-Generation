package com.generation.lojagames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_produto")

public class Produto {
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message = "O nome deve do produto deve ser informado!")
	@Size(min = 2, max = 20, message = "O nome deve ter no mínimo 1 e no máximo 20 caracteres!")
	@Column (length = 20)
	private String nome;
	
	@Size(min = 5, max = 500, message = "A descrição deve ter no mínimo 5 e no máximo 500 caracteres!")
	@Column (length = 500)
	private String descricao;
	
	@NotBlank (message = "VocÊ deve informar um console para o produto!")
	@Size(min = 3, max = 15, message = "O console deve ter no mínimo 3 e no máximo 15 caracteres!")
	@Column (length = 15)
	private String console;
	
	@NotNull (message = "A quantidade deve ser informada!")
	@Positive (message = "Deve ser informado apenas núemros positivos!")
	private int quantidade;
	
	@NotNull (message = "É necessário informar um preço para o produto!")
	@Positive (message = "O valor do preço deve positivo!")
    private float preco;
	
	@ManyToOne
	@JsonIgnoreProperties("Produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}