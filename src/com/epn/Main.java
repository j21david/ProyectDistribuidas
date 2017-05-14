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

public class Main {
	public static float matriz[][]=new float[12384][12384];
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		long time_start, time_end;
		time_start = System.currentTimeMillis()/1000;
		

		Lector r = new Lector();
		
		Calculadora calc=new Calculadora(40,r.getCompuestos());
		

		Thread t0 = new Thread(new MiThread(0,r.getCompuestos()));
		Thread t1 = new Thread(new MiThread(10,r.getCompuestos()));
		Thread t2 = new Thread(new MiThread(20,r.getCompuestos()));
		Thread t3 = new Thread(new MiThread(30,r.getCompuestos()));
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		
		t0.join();
		t1.join();
		t2.join();
		t3.join();
		
		Redactor c = new Redactor();
		Lector l = new Lector();
		ArrayList<Quimico> arrayList = new ArrayList<Quimico>();
		 
		for(int i=0;i<40;i++){
			for(int j=0;j<40;j++){
				
				//System.out.print(String.format("%.2f ",calc.result()[i][j]));
				if(matriz[i][j]>0.5){
					 Quimico  k= new Quimico();
					k.setCompuesto1(l.Ids[i]);
					k.setCompuesto2(l.Ids[j]);
					k.setResultado(matriz[i][j]);
					arrayList.add(k);
					
				//c.escribir(l.Ids[i],l.Ids[j],String.format("%.2f ",matriz[i][j]));
				}
			}
		}
		Collections.sort(arrayList);
		
		Iterator itListaempleado=arrayList.iterator();
        
        //imprime la lista sin ordenar
        while (itListaempleado.hasNext()) {
            Quimico elementoLista=(Quimico)itListaempleado.next();

            c.escribir(elementoLista.getCompuesto1(),elementoLista.getCompuesto2(),String.format("%.2f ",elementoLista.getResultado()));
        }
	
		time_end = System.currentTimeMillis()/1000;
		System.out.println("the task has taken "+ ( time_end - time_start ) +" seconds");

	}

}
