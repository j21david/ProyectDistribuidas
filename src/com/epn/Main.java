package com.epn;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		Lector r = new Lector();
		
		Calculadora calc=new Calculadora(10,r.getCompuestos());
		Redactor c = new Redactor();
		Lector l = new Lector();
		 
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				c.escribir(l.Ids[i],l.Ids[j],String.format("%.2f ", calc.result()[i][j]));
			}System.out.println("\n");
		}
		


	}

}
