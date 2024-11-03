package com.ingresskubernetes.ingress.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Student {
	
	private String name;
	private String classname;

}
