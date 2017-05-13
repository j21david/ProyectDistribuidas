package com.epn;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		Lector r = new Lector();
		
		Calculadora calc=new Calculadora(1000,r.getCompuestos());

		System.out.println(""+calc.result()[50][50]);

		//chao
	}

}
