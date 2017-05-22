package com.epn;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Redactor {
	
	public void escribir(String id1,String id2, String valor) throws IOException {
        String ruta = "C:/Users/Jose/Documents/sulution21.tsv";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo,true));
            bw.write("\n"+id1+"	"+id2+"	"+valor);
        } else {
        	  bw = new BufferedWriter(new FileWriter(archivo,true));
              bw.write("\n"+id1+"	"+id2+"	"+valor);
        }
        bw.close();
    }
	
	
	
	
	

}
