package example;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus(); // here Bus replace with Car viceversa 
		String mileage = vehicle.getMileage();
		System.out.println(mileage);
	}

}
