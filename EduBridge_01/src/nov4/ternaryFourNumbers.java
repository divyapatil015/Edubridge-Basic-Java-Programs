package nov4;

public class ternaryFourNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int b= 3;
		int c= 4;
		int d=9;
		
		int big =(a>b && a>c && a>d)?a:(b>a && b>c && b>d)?b:(c>a && c>b && c>d)?c:d;
		System.out.println(big);

	}

}
