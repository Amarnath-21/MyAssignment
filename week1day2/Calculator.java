package week1day2;

public class Calculator {
	
	 public void additionTwoNumbers(int A,int B) {
		int C = A+B;
		System.out.println(C);
		
		}
	public void subractionTwoNumber(int s,int g) {
			int e = s- g;
			System.out.println(e);
		
		}
		public void multipleTwoNumbers(double l,double m) {
			double g = l*m;
			System.out.println(g);
		}
		public void divideTwoNumbers(float f,float k) {
			float x = f/k;
			System.out.println(x);
		}
		public static void main(String[] args) {
			Calculator cals = new Calculator();
			cals.additionTwoNumbers(84, 44);
			cals.subractionTwoNumber(38, 65);
			cals.multipleTwoNumbers(47.4545, 23.4824556);
			cals.divideTwoNumbers(4541f, 52f);
		}
	}

