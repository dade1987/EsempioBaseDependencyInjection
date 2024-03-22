package dep.inj;

public class Main {

	public static void main(String[] args) {

		ReadStringInterface uno = new ReadStringTwo();
		
		ReadStringApp app = new ReadStringApp(uno);
		
		System.out.println(app.read());
		
	}

}
