package testApp;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("2nd version");
		Math cMath = new Math();
		//�ժ��s�W�x
		System.out.println();
		System.out.print(cMath.add(5, 5));
	}
	
	

	
	
}
class Math{
	int add(int x,int y) {
		return x+y;
	}
	
}