//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int num;
	int den;

	//write two constructors
	public Rational() {
		this(1, 1);
	}
	
	public Rational(int num, int den) {
	this.num=num;
	this.den=den;
	}

	//write a setRational method
	public void setRational(int a, int b) {
		num=a;
		den=b;
	}
	
	//write  a set method for numerator and denominator

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		num=num*other.getDen()+other.getNum()*den;
		den=den*other.getDen();


		reduce();
	}

	private void reduce()
	{
		int div=gcd(num, den);
		while(div != 1) {
			num=num/div;
			den=den/div;
			div=gcd(num, den);
		}


	}

	private int gcd(int numOne, int numTwo)
	{
		int biggest=1;
		
		
		for(int i=2; i<numOne || i<numTwo; i++) {
			if(numOne%i==0 && numTwo%i==0) {
				biggest=i;
			}
		}


		return biggest;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNum() {
		return num;
	}
	public int getDen() {
		return den;
	}
	
	public boolean equals( Object obj)
	{
		if(obj.toString().equals(num+"/"+den)) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		reduce();
		other.reduce();
		double i = num/den;
		double j = other.getNum()/other.getDen();

		if(i>j) {
			return 1;
		}
		if (i==j) {
			return 0;
		}
		return -1;
	}



	
	public String toString() {
		return num+"/"+den;
	}
	
	
}