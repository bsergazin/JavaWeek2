enum PowerType {ELECTRIC, GAS, DIESEL};

enum CarStyle {SEDAN, COUPE, SUV, TRUCK};

enum CarMake {TESLA, TOYOTA, HONDA};
enum CarModel {S, Y, X, CAMRY, TUNDRA, TACOMA, PILOT, CIVIC};

/**
 * Car
 */
public class Car {
    private int horsePower;
    private PowerType powerType;
    private CarStyle carStyle;   
    private CarMake carMake;
    private CarModel carModel;
    private double mileage;
    static int numberOfCars;
    final private int yearMake;

    public static double ConvertMileageToKilometers(double mileage) {
        return mileage * 1.609;
    }
    
    public Car(CarMake carMake, CarModel carModel, int yearMake) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.yearMake = yearMake;
        numberOfCars++;
    }

    public void Drive(double milesDriven) {
        this.mileage = this.mileage + milesDriven;
    }

    public void Honk() {
        System.out.println("HONK");
    }

    public String toString(){
        return carMake + " " + carModel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int hp) {
        if(hp < 180) {
            horsePower = 180;
        } else if(hp > 200) {
            horsePower = 200;
        } else {
            horsePower = hp;
        }
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public void setPowerType(PowerType pt) {
        powerType = pt;
    }

    public CarStyle getCarStyle() {
        return carStyle;
    }

    public void setCarStyle(CarStyle cs) {
        carStyle = cs;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage; 
    }

    public int getYear() {
        return this.yearMake; 
    }
}