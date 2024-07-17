package oopsDay1;

public class DemoCarRental {

	public static void main(String[] args) {
		
		CarRental cr = new CarRental();
		
		cr.getCar(101, "SUV", 2500);
		cr.ShowCar();
		cr.getCar(201, "Small", 1000);
		cr.ShowCar();
		cr.getCar(301, "van", 800);
		cr.ShowCar();
	}
}
