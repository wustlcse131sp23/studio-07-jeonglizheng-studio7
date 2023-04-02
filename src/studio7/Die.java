package studio7;

public class Die {
	private int n;
	
	public Die() {
		this.n = 0;
	}
	
	public Die(int n) {
		this.n = n;
	}
	
	public int getN() {
		return this.n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public String toString() {
		return "n: " + this.n;
	}
	
	public int throwDie() {
		return (int) (Math.random() * n) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die1 = new Die(6);
		System.out.println(die1);
		System.out.println(die1.throwDie());
		System.out.println(die1.getN());
		die1.setN(20);
		System.out.println(die1.getN());
		System.out.println(die1.throwDie());

	}

}
