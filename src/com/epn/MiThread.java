package com.epn;
import static com.epn.Main.matriz;
public class MiThread extends Thread {


int j=0;
String compuestos[]= new String [12384];



	public MiThread(int j,String c[]) {
	super();
	this.j = j;
	this.compuestos=c;
}

	public void run(){
		//int y=0;
		for(int i=j;i<j+10;i++){
			for(int k=i;k<40;k++){
				Contador c = new Contador(compuestos[i]+" ");
				Contador c1 = new Contador(compuestos[k]+" ");
				Comparador fin = new Comparador(c.getConteo(), c1.getConteo(), c.numeroElementos(), c1.numeroElementos());
				matriz[i][k]=fin.formula();
				matriz[k][i]=fin.formula();
				
			}
		}
		
		
	}
}
