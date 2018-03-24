package test;

public class MyJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = -9;
		System.out.println("The absolute of a is "+Abso(a));
		System.out.println("The absolute of b is "+Abso(b));
		b=a;
		System.out.println(a+" "+b);
		
	}
	public static int Abso(int x) {
		if (x>0)
			return x;
		else
			return -x;
	}
	public static boolean isEqual(int a, int b) {
		if (a == b)
			return true;
		return false;
	}
	public static boolean isSame(String a, String b) {
		boolean ans = a==b;
		if (ans)
			return true;
		return false;
	}
}
