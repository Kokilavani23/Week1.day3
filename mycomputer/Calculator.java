package mycomputer;

public class Calculator {
	public float add(float a,float b) {
		float total=a+b;
		return total;
	}
	public void sub(float total,double c) {
		double d=total-c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		float total=cal.add(2.4f,2.4f);
		System.out.println(total);
		cal.sub(total,32.54);
		
		// TODO A
	}

}
