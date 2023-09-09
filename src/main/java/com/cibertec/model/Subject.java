package com.cibertec.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "subject")
@Data
@NoArgsConstructor
public class Subject {

	@Id
	private int idSubject;
	private String code;
	private String name;
	private String level;
	private String teacher;
}
