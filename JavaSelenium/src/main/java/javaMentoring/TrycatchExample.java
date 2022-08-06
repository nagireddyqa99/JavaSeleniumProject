package javaMentoring;

public class TrycatchExample {
	
	@SuppressWarnings("finally")
	static int demo() {
		try {
			int a= 22/0;
			System.out.println(a);
			return 1;
		}catch (Exception e){
			System.out.println("Exception");
			return 2;
		}
		finally{
			return 3;
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(demo());
	}

}
