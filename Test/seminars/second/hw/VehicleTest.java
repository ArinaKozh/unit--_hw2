package seminars.second.hw;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void checkIfInstanseOf(){
        Car car = new Car();
        assert car instanceof Vehicle;
    }

    @Test
    void checkIfCarHasFour(){
        Car car = new Car();
        assert car.getNumWheels() == 4;
    }

    @Test
    void checkIfMotoHasTwo(){
        Motorcycle motorcycle = new Motorcycle();
        assert  motorcycle.getNumWheels() == 2;
    }

    @Test
    void speedLevelIs60(){
        Car car = new Car();
        car.testDrive();
        assert car.getSpeed() == 60;
    }

    @Test
    void speedLevelIs75(){
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.testDrive();
        assert motorcycle.getSpeed() == 75;
    }

    @Test
    void carStopsWhenParking(){
        Car car = new Car();
        car.park();
        assert car.getSpeed() == 0;
    }

    @Test
    void motoStopsWhenParking(){
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.park();
        assert motorcycle.getSpeed() == 0;
    }



}