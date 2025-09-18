package functional_interface;

@FunctionalInterface
interface FunctinalInterface {

	int speed();
	
	default int gear() {
		return 5;
	}
	
	static String breakType() {
		return "Manual";
	}
}

public class MyFunctinalInterface {
	public static void main(String[] args) {
		FunctinalInterface obj = ()-> {
			int a = 52;
			int b = 12;
			return a + b;
			
		};
		
		
		System.out.println(obj.speed());
	}
}
