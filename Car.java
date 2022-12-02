public class Car {
    public static void main(String [] args) {
	    Car myCar = new Car();
		
		for (int x=0; x<5000; x++) {
		    myCar = new Car();
			myCar[x].whee11 = x;
			myCar[x].whee12 = x+1;
			myCar[x].whee13 = x+2;
			myCar[x].whee14 = x+3;
			int z = myCar.lanuch(7);
			System.out.println(z);
		}
	}
}