package com.epn;

import static com.epn.Main.matriz;
public class Calculadora {

	
	//float matriz[][] = new float [40][40];
	int limit;
	String compuestos[]= new String [12384];
	
	
	public Calculadora(int i,String c[]) {
		super();
		this.limit=i;
		this.compuestos=c;
	}




	public float[][] result(){
	
		for(int i=0;i<7;i++){
			for(int j=i+1;j<7;j++){
				Contador c = new Contador(compuestos[i]+" ");
				Contador c1 = new Contador(compuestos[j]+" ");
			
				Comparador fin = new Comparador(c.getConteo(), c1.getConteo(), c.numeroElementos(), c1.numeroElementos());
				System.out.print("\n"+ c.numeroElementos()+" \n "+ c1.numeroElementos()+"\n"+fin.formula());
				matriz[i][j]=fin.formula();
				matriz[j][i]=fin.formula();
				
			}
		}
		
		
		
		return matriz;
		
	}
	
	
	
}
