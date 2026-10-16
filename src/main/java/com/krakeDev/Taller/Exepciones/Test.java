package com.krakeDev.Taller.Exepciones;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	private static final Logger log = LogManager.getLogger(Test.class);

	public static void main(String[] args) {
		try {
			GuardarContacto.guardar();
			log.info("Se guardo un archivo");
		} catch (IOException e) {
			log.error("Ocurrio un error: ", e);
		}
System.out.println("El programa se sigue ejecutando");
	}

}
