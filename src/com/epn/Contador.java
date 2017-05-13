package com.epn;

public class Contador  {

	String compuesto;
	int conteo[]=new int[132];
	String elementos1[]={"Uub","Uuh","Uuu","Uuo","Uup","Uuq","Uus","Uut"};
	String elementos2[]={"Al","Am","Sb","Ar","As","At","Ba","Be","Bk","Bi","Bh","Br","Cd","Ca","Cf","Ce","Cs","Cl","Co","Cu","Cr","Cm",
			"Ds","Dy","Db","Es","Er","Sc","Sn","Sr","Eu","Fm","Fr","Gd","Ga","Ge","Hf","Hs","He","Fe","Ho","In","Ir",
			"Yb","Kr","La","Lr","Li","Lu","Mg","Mn","Mt","Md","Hg","Mo","Nd","Ne","Np","Nb","Ni","No","Au","Os","Pd","Ag",
			"Pt","Pb","Pu","Po","Pr","Pm","Pa","Ra","Rn","Re","Rh","Rb","Ru","Rf","Sm","Sg","Se","Si","Na","Tl","Ta","Tc","Te","Tb",
			"Ti","Th","Tm","Xe","Zn","Zr"};
	String elementos3[]={"S","s","B","b","C","c","F","f","P","p","H","h","I","i","Y","y","N","n","O","o","K","k","U","u","V","v","W","w","@"};
	
	public Contador(String compuesto) {
		super();
		
			this.compuesto=compuesto;
			conteoElementos();
		
	}
	
	public int[] getConteo() {
		return conteo;
	}

	public void setConteo(int[] conteo) {
		this.conteo = conteo;
	}

	void conteoElementos(){

		int h=0;
				

		while(h!=compuesto.length())
		{


			for(int i =0;i<8;i++)
				{
			
				if(compuesto.charAt(0+h)==elementos1[i].charAt(0)&&compuesto.charAt(1+h)==elementos1[i].charAt(1)&&compuesto.charAt(2+h)==elementos1[i].charAt(2))
					{
					conteo[i]=conteo[i]+1;
					h=3;
					break;	
						
					}
				}

			for(int i =0;i<95;i++)
				{

				if(compuesto.charAt(0+h)==elementos2[i].charAt(0)&&compuesto.charAt(1+h)==elementos2[i].charAt(1))
					{
	
					conteo[i+8]=conteo[i+8]+1;
					h=h+2;
					break;		
					}
				}



			for(int i =0;i<29;i++)
				{


				if(compuesto.charAt(0+h)==elementos3[i].charAt(0))
					{
						if(compuesto.charAt(0+h)!='@')
						{
							conteo[i+103]=conteo[i+103]+1;
						}
						else 
						{
							conteo[i+103]=1;
						}						
						//h++;
						break;	
				
					}
					
				}
			h++;
		
		}
	}
	
	int numeroElementos()
	{
	int suma=0;

	for(int i=0;i<132;i++)
		{
	
		suma+=conteo[i];
	
		}	
	return suma;

	}
	
	
	
}
