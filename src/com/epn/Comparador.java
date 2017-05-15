package com.epn;

public class Comparador {

	int n1[]=new int [132];
	int n2[]=new int [132];
	float Na;
	float Nb;
	
	
	public Comparador(int[] n1, int[] n2,int na ,int nb) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.Na=na;
		this.Nb=nb;
	}

	float similitud(){

		int aux=0;
		for(int i=0;i<132;i++){
		
		if(n1[i]!=0&&n2[i]!=0)
			{
			if(n1[i]<=n2[i])
			{		
			aux=aux+n1[i];		
			}
			if(n2[i]<n1[i])
			{
			aux=aux+n2[i];
			}
			}
		}
		return aux;
		}

	float formula(){

		float Nc=this.similitud();
		float result=(Nc/(Na+Nb-Nc));

		return result;

	}
	
	
}
