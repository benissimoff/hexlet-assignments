package exercise;

// BEGIN

import lombok.Getter;

class Flat implements Home {
    double area;
    private double balconyArea;

    @Getter
    private int floor;

    Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public String toString() {
        String result = String.format("Квартира площадью %s метров на %s этаже", this.getArea(), this.floor);
//System.out.println("Flat.toString " + result);
        return result;
    }

    @Override
    public double getArea() {
        return this.area + this.balconyArea;
    }
}
// END
