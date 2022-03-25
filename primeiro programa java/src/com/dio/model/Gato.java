package com.dio.model;

import java.util.Objects;

public class Gato {

  private String cor;
  private String nome;
  private Integer idade;
  
public Gato(String cor, String nome, Integer idade) {
	this.cor = cor;
	this.nome = nome;
	this.idade = idade;
}

public Gato() {
	// TODO Auto-generated constructor stub
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Integer getIdade() {
	return idade;
}

public void setIdade(Integer idade) {
	this.idade = idade;
}

public int hashCode() {
	return Objects.hash(cor, idade, nome);
}

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Gato other = (Gato) obj;
	return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
}

public String toString() {
	return "Gato [cor=" + cor + ", nome=" + nome + ", idade=" + idade + "]";
}
  
  
  
	  
  }


