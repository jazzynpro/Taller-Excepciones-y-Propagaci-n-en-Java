package com.krakeDev.Taller.Exepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GuardarContacto {
	
	private static final Logger log = LogManager.getLogger(GuardarContacto.class);
	
	
	public static void guardar(String telefono){
		FileWriter escritor = null; //escribir el archivo
		
		try{
			escritor = new FileWriter("contactos.txt");
			
			escritor.write("nombre: Maria\n");
			escritor.write("apellido: Gomez\n");
			escritor.write("telefono: " + telefono + "\n");
			
			log.info("Se guardo exitosamente");
				
			}catch(IOException e) {
				log.error("Ocurrio un error: ", e);
			}finally {
				try {if (escritor != null) {
					escritor.close();
					log.info("Se cerro el escritor exitosamente");
				}} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

