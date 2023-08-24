package com.itb.tcc.myproject2h.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pessoas")
public class Pessoa {

	@Id   // Chave Primária
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto - Incremento
	private Long id;
	private String nome;
	private String tipoPessoa;
	private String email;
	private String telefone;
	private LocalDateTime dataDeNascimento;
	private String cpf;
	private String senha;
	
	
	
}
