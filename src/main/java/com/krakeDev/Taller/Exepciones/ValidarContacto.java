package com.krakeDev.Taller.Exepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ValidarContacto {
	private static final Logger log = LogManager.getLogger(ValidarContacto.class);
	
	public static void validarTelefono(String telefono) throws IllegalArgumentException{
		if(telefono.length() != 10) {
			throw new IllegalArgumentException("Telefono debe tener 10 digitos");
		}
		log.info("Telefono cumple la condicion");
	}
}
