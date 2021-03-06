package br.com.blackmarket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Entity
public class Professor {
	
	@GeneratedValue @Id
	private Long id;
	
	@NotNull(message="NÃO PODE SER EM BRANCO")
	private String materia;
	
	@NotNull(message="NÃO PODE SER EM BRANCO")
	private String nome;
	
	@NotNull(message="NÃO PODE SER EM BRANCO")
	private String endereco;
	
	@NotNull(message="NÃO PODE SER EM BRANCO")
	@Min(value = 0, message="NÃO PODE SER MENOR QUE 0")
	private Double telefone;

	
	@Deprecated
	public Professor() {
		this(null, null, null, null);
	}
	
	public Professor(String materia, String nome, String endereco, Double telefone) {
		this.materia = materia;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getTelefone() {
		return telefone;
	}

	public void setTelefone(Double telefone) {
		this.telefone = telefone;
	}
	
}
