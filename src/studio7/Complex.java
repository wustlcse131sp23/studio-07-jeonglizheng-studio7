package studio7;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex() {
		this.real = 0;
		this.imaginary = 1;
	}
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	// Get method for real
	public double getReal() {
		return this.real;
	}
	
	// Set method for real
	public void setReal(double real) {
		this.real = real;
	}
	
	// Get method for imaginary
	public double getImaginary() {
		return this.imaginary;
	}
	
	// Set method for imaginary
	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
		
	// toString for Complex
	public String toString() {
		return this.real + " + " + this.imaginary + " * i";
	}
	
	// Complex add
	public Complex addComplex(Complex complex2) {
		double newReal = this.getReal() + complex2.getReal();
		double newImaginary = this.getImaginary() + complex2.getImaginary();
		return new Complex(newReal, newImaginary);
	}
	
	// Complex multiply
	public Complex multiplyComplex(Complex complex2) {
		double newReal = this.getReal() * complex2.getReal() - this.getImaginary() * complex2.getImaginary();
		double newImaginary = this.getReal() * complex2.getImaginary() + this.getImaginary() * complex2.getReal();
		return new Complex(newReal, newImaginary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex comp23 = new Complex(2,3);
		Complex comp32 = new Complex(3,2);
		System.out.println(comp23);
		System.out.println(comp23.addComplex(comp32));
		System.out.println(comp23.multiplyComplex(comp32));
	}

}
