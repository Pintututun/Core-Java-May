package lambda_program_may22;

public class Fun_Inter {
	public static void main(String[] args) {
		Thread t=new Thread(()-> {
		System.out.println("NIT");
		});
		t.start();
		}

}
