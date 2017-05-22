package com.epn;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


import org.omg.CosNaming.BindingListHelper;

public class Main {
	public final static int limite = 4000;
	public static float matriz[][]=new float[limite][limite];
	public static String Compuestos[]=new String[limite];
	public static String Ids[]=new String[limite];
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		long time_start, time_end;
		time_start = System.currentTimeMillis();
		

		Lector r = new Lector();
		
		//Calculadora calc=new Calculadora(limite,Compuestos);
		
		//calc.result();
		Redactor c = new Redactor();

		
	/*	
		Thread t0 = new Thread(new MiThread(0,1606));
		Thread t1 = new Thread(new MiThread(1606,3512));
		Thread t2 = new Thread(new MiThread(3512,5995));
		Thread t3 = new Thread(new MiThread(5995,12000));
		*/
		Thread t0 = new Thread(new MiThread(0,534));
		Thread t1 = new Thread(new MiThread(534,1169));
		Thread t2 = new Thread(new MiThread(1169,1996));
		Thread t3 = new Thread(new MiThread(1996,4000));
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		
		t0.join();
		t1.join();
		t2.join();
		t3.join();
		time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" miliseconds");
	/*
		
		ArrayList<Quimico> arrayList = new ArrayList<Quimico>();
		arrayList.ensureCapacity(7900000);
		for(int i=0;i<limite;i++){
			for(int j=i+1;j<limite;j++){
				System.out.println(" "+matriz[i][j]);

				if(matriz[i][j]>=0.5){
					
				
					//c.escribir(l.Ids[i],l.Ids[j],String.format("%.2f ",matriz[i][j]));
					Quimico  k= new Quimico();
					k.setCompuesto1(Ids[i]);
					k.setCompuesto2(Ids[j]);
					k.setResultado(matriz[i][j]);
					arrayList.add(k);
			
		
				}
			}//System.out.print(""+i+"\n");
		}
		
		//Ordenar la lista
		//arrayList.ensureCapacity(7900000);
		Collections.sort(arrayList);
		

		
		Iterator itListaempleado=arrayList.iterator();
        
        //imprime la lista ordenada
        while (itListaempleado.hasNext()) {
            Quimico elementoLista=(Quimico)itListaempleado.next();
           
            System.out.println(" "+elementoLista.getCompuesto1()+"    "+elementoLista.getCompuesto2()+"  "+elementoLista.getResultado());
            //c.escribir(elementoLista.getCompuesto1(),elementoLista.getCompuesto2(),String.format("%.2f ",elementoLista.getResultado()));
        }
	
		*/

	}

}
