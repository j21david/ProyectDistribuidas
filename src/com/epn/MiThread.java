package com.epn;
import static com.epn.Main.matriz;
import static com.epn.Main.Compuestos;
import static com.epn.Main.Ids;

public class MiThread extends Thread {


int j=0;
int sum=0;




	public MiThread(int j,int sumatorio) {
	super();
	this.j = j;
	this.sum=sumatorio;
}

	public void run(){
		//int y=0;
		for(int i=j;i<j+sum;i++){
			for(int k=i+1;k<4000;k++){
				Contador c = new Contador(Compuestos[i]+" ");
				Contador c1 = new Contador(Compuestos[k]+" ");
				Comparador fin = new Comparador(c.getConteo(), c1.getConteo(), c.numeroElementos(), c1.numeroElementos());
				
				matriz[i][k]=fin.formula();
				matriz[k][i]=fin.formula();
				
	
				
			}
		}
		
		
	}
}
