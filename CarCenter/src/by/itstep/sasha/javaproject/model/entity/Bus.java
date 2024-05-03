package by.itstep.sasha.javaproject.model.entity;

public class Bus extends Car{
    private int numberOfSeats;
    private boolean airConditioning;

    public Bus() {

    }

    public Bus(int numberOfSeats, double price, boolean airConditioning) {
        super(price);
        this.numberOfSeats = numberOfSeats;
        this.airConditioning = airConditioning;

    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numberOfSeats=" + numberOfSeats +
                ", airConditioning=" + airConditioning +
                ", " + super.toString() + '}';
    }
}
