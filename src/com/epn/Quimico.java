package com.epn;

public class Quimico implements Comparable<Quimico>{
	
	String Compuesto1=" ";
	String Compuesto2=" ";
	float resultado;
	
	
	public String getCompuesto1() {
		return Compuesto1;
	}
	public void setCompuesto1(String compuesto1) {
		Compuesto1 = compuesto1;
	}
	public String getCompuesto2() {
		return Compuesto2;
	}
	public void setCompuesto2(String compuesto2) {
		Compuesto2 = compuesto2;
	}
	public float getResultado() {
		return resultado;
	}
	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	@Override
	public int compareTo(Quimico o) {
	 
		int byAge = Float.compare(o.resultado, resultado);
	        if ( byAge != 0 ) {
	            return byAge;
	        }
	   
	        if ( Compuesto1 == null ) {
	            return o.Compuesto1 == null ? 0 : 1;
	        }
	        if ( o.Compuesto1 == null ) {
	            return 1;
	        }
	        return Compuesto1.compareToIgnoreCase(o.Compuesto1);
	}
	
	
	
	

}
