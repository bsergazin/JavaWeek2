enum PowerType {ELECTRIC, GAS, DIESEL};

enum CarStyle {SEDAN, COUPE, SUV, TRUCK};
/**
 * Car
 */
public class Car {
    private int horsePower;
    private PowerType powerType;
    private CarStyle carStyle;   

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
}