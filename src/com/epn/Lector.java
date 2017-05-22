package com.epn;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import static com.epn.Main.Compuestos;
import static com.epn.Main.Ids;
import static com.epn.Main.limite;
public class Lector {

	String archivo="C:/Users/Jose/Documents/ZINC_chemicals.tsv";

	
	public String[] getIds() {
		return Ids;
	}


	public void setIds(String[] ids) {
		Ids = ids;
	}


	public String[] getCompuestos() {
		return Compuestos;
	}


	public void setCompuestos(String[] compuestos) {
		Compuestos = compuestos;
	}


	public Lector() throws FileNotFoundException, IOException {
		super();
		this.muestraContenido();
		this.muestraContenido2();
	}


	public  void muestraContenido() throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        cadena = b.readLine();
        for(int i=0;i<limite;i++){
        	cadena = b.readLine();
        	StringTokenizer tokens=new StringTokenizer(cadena);
        			tokens.nextToken();
        			tokens.nextToken();
        			tokens.nextToken();
                    Compuestos[i]=tokens.nextToken();
  
        }
        b.close();
    }
	public  void muestraContenido2() throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        cadena = b.readLine();
        for(int i=0;i<limite;i++){

        	cadena = b.readLine();
        	StringTokenizer tokens=new StringTokenizer(cadena);
        			tokens.nextToken();        		
                    Ids[i]=tokens.nextToken();
               
           
        }
        b.close();
    }
}
