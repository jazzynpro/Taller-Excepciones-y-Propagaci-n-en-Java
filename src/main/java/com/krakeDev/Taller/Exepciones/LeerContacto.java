package com.krakeDev.Taller.Exepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LeerContacto {
	private static final Logger log = LogManager.getLogger(LeerContacto.class);
	
	public static void leer() {
		FileReader lectorArchivo = null;
		BufferedReader lector = null;
		
		try {
			lectorArchivo = new FileReader("contactos.txt");
			lector = new BufferedReader(lectorArchivo);
			//readLine lee linea por linea
			System.out.println(lector.readLine());
			
			log.info("Se pudo leer exitosamente");
			
		}catch(FileNotFoundException e) {
			log.error("Ocurrio un error al buscar el archivo ", e);
		}catch(IOException e) {
			log.error("Ocurrio un error al encontrar el archivo ", e);
		}finally {
			try {
				lectorArchivo.close();
				lector.close();
				log.info("Se cerro exitosamente");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
