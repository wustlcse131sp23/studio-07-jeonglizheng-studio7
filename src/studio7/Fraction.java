package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction() {
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	// Get method for numerator
	public int getNumerator() {
		return this.numerator;
	}
	
	// Set method for numerator
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	// Get method for denominator
	public int getDenominator() {
		return this.denominator;
	}
	
	// Set method for denominator
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
		
	// toString for Fraction
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	
	// Fraction add
	public Fraction addFraction(Fraction fraction2) {
		int newDenominator = this.getDenominator() * fraction2.getDenominator();
		int newNumerator = this.getNumerator() * fraction2.getDenominator()
							+ fraction2.getNumerator() * this.getDenominator();
		return new Fraction(newNumerator, newDenominator);
	}
	
	// Fraction multiply
	public Fraction multiplyFraction(Fraction fraction2) {
		int newDenominator = this.getDenominator() * fraction2.getDenominator();
		int newNumerator = this.getNumerator() * fraction2.getNumerator();
		return new Fraction(newNumerator, newDenominator);
	}
	
	// Fraction reciprocal
	public Fraction reciprocalFraction() {
		int newDenominator = this.getNumerator();
		int newNumerator = this.getDenominator();
		return new Fraction(newNumerator, newDenominator);
	}
		
	public static int gcd(int p, int q) {
		if (q == 0) {
			return 0;
		}
		else {
			if (p % q == 0) {
				return q;
			}
			else {
				return gcd(q, p % q);
			}
		}
	}
	
	// Fraction simplify
	public Fraction simplifyFaction() {
		int gcd = gcd(this.getNumerator(), this.getDenominator());
		int newDenominator = this.getDenominator() / gcd;
		int newNumerator = this.getNumerator() / gcd;
		return new Fraction(newNumerator, newDenominator);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction frac23 = new Fraction(2,3);
		Fraction frac32 = new Fraction(3,2);
		System.out.println(frac23);
		System.out.println(frac23.addFraction(frac32));
		System.out.println(frac23.multiplyFraction(frac32));
		System.out.println(frac23.reciprocalFraction());
		System.out.println(frac23.multiplyFraction(frac32).simplifyFaction());
	}

}
