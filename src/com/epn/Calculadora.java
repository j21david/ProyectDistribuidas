package com.epn;

public class Calculadora {

	
	float matriz[][] = new float [12384][12384];
	int limit;
	String compuestos[]= new String [12384];
	
	
	public Calculadora(int i,String c[]) {
		super();
		this.limit=i;
		this.compuestos=c;
	}




	public float[][] result(){
	
		for(int i=0;i<limit;i++){
			for(int j=0;j<limit;j++){
				Contador c = new Contador(compuestos[i]+" ");
				Contador c1 = new Contador(compuestos[j]+" ");
				Comparador fin = new Comparador(c.getConteo(), c1.getConteo(), c.numeroElementos(), c1.numeroElementos());
				matriz[i][j]=fin.formula();
				
			}
		}
		
		
		
		return matriz;
		
	}
	
	
	
}
