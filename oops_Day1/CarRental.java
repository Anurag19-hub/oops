package oopsDay1;

/*
 *   Define a class CarRental with the followinig details:
 *   
 *   Class Members are : CarId of int type, CarType of String type
 *   and Rent of float type.
 *   
 *    Define GetCar() method which accepts CarId and CarType.
 *    GetRent() method which return of the car on the basis of car type,
 *    i.e. Small car = 1000, Van = 800, SUV = 2500
 *    
 *    ShowCar() method which allows user to view the contents of cars
 *    i.e. id, type and rent
 */
	

public class CarRental {

	// Data Members
	
	private int CarId;
	private String CarType;
	private float Rent;
	
	public int getCarId() {
		return CarId;
	}
	public void setCarId(int carId) {
		CarId = carId;
	}
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		CarType = carType;
	}
	public float getRent() {
		return Rent;
	}
	public void setRent(float rent) {
		Rent = rent;
	}
	@Override
	public String toString() {
		return "CarRental [CarId=" + CarId + ", CarType=" + CarType + ", Rent=" + Rent + "]";
	}
	
	public void getCar(int CarId, String CarType, float Rent) {
		
		this.CarId = CarId;
		this.CarType = CarType;
		this.Rent = Rent;
	}
	
	public void ShowCar() {
		
		System.out.println("Carid: " +CarId + ", Cartype: "+ CarType +",Rent: " +  Rent);
	}
	
}
