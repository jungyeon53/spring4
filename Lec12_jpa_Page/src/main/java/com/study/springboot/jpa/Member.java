package com.study.springboot.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Builder
@Entity(name="JPAMEMBER03")
public class Member {
	@Id
	@SequenceGenerator(
		name="MySequence03",
		sequenceName = "JPAMEMBER03_SEQ",
		initialValue = 1, 
		allocationSize = 1
			)
	@GeneratedValue(generator = "MySequence03")
	private Long id;
	private String name;
	private String email;
}
