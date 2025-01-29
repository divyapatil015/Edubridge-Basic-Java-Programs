package nov4;

public class ternaryThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int b= 3;
		int c= 4;
		
		int big =(a>b && a>c)?a:(b>a && b>c)?b:c;
		System.out.println(big);

	}

}
