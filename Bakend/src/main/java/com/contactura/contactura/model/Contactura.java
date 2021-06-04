package com.contactura.contactura.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Criação de construtores padrões
@AllArgsConstructor
//cria o contrutor
@NoArgsConstructor
//cria os gets e sets, assim como nossos hashcodes, etc
@Data
//Definir qaundo uma classe é uma entidade espelho do banco de dados
@Entity
public class Contactura {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String email;
	private String phone;

}
