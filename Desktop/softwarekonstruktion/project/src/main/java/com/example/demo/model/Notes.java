package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Notes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;

	// forbinder denne klasse med følgende klasse:
	@OneToOne
	private Recipe recipe;

	// why? fordi man bruge foreign keys i databasen
}