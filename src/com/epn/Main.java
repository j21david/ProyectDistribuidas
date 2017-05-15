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
	public static float matriz[][]=new float[12422][12422];
	public static String Compuestos[]=new String[12422];
	public static String Ids[]=new String[12422];
	
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		long time_start, time_end;
		time_start = System.currentTimeMillis()/1000;
		

		Lector r = new Lector();
		
		//Calculadora calc=new Calculadora(2,r.getCompuestos());
		Redactor c = new Redactor();

		
		Thread t0 = new Thread(new MiThread(0,1000));
		Thread t1 = new Thread(new MiThread(1000,1000));
		Thread t2 = new Thread(new MiThread(2000,1000));
		Thread t3 = new Thread(new MiThread(3000,1000));
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		
		t0.join();
		t1.join();
		t2.join();
		t3.join();
		
		
		
		ArrayList<Quimico> arrayList = new ArrayList<Quimico>();
		arrayList.ensureCapacity(7900000);
		for(int i=0;i<4000;i++){
			for(int j=i+1;j<4000;j++){
				

				if(matriz[i][j]>=0.5){
					
				
					//c.escribir(l.Ids[i],l.Ids[j],String.format("%.2f ",matriz[i][j]));
					Quimico  k= new Quimico();
					k.setCompuesto1(Ids[i]);
					k.setCompuesto2(Ids[j]);
					k.setResultado(matriz[i][j]);
					arrayList.add(k);
			
		
				}
			}System.out.print(""+i+"\n");
		}
		
		//Ordenar la lista
		//arrayList.ensureCapacity(7900000);
		Collections.sort(arrayList);
		
		Iterator itListaempleado=arrayList.iterator();
        
        //imprime la lista ordenada
        while (itListaempleado.hasNext()) {
            Quimico elementoLista=(Quimico)itListaempleado.next();
           
            //System.out.println(" "+elementoLista.getCompuesto1()+"    "+elementoLista.getCompuesto2()+"  "+elementoLista.getResultado());
            c.escribir(elementoLista.getCompuesto1(),elementoLista.getCompuesto2(),String.format("%.2f ",elementoLista.getResultado()));
        }
	
		time_end = System.currentTimeMillis()/1000;
		System.out.println("the task has taken "+ ( time_end - time_start ) +" seconds");

	}

}
//198569
//[O-]C(=O)[C@H](c1ccc(cc1)c1ccccc1)C 						=2(O)+12(c)+1(@)+3(C)+1(H)=19
//Fc1ccc(cc1)C(c1ccc(cc1)F)OC1C[C@@H]2CC[C@H](C1)[NH+]2C	 = 2(F)+9(C)+12(c)+3(H)+1(N)+1(@)=28       =12+1+3+1=16

//

