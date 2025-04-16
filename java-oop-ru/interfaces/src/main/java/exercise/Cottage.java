package exercise;

// BEGIN
class Cottage implements Home {
    private double area;
    private int floorCount;

    Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public String toString() {
        String result = String.format("%s этажный коттедж площадью %s метров", this.floorCount, this.getArea());
//        System.out.println("Cottage.toString " + result);

        return  result;
    }

    @Override
    public double getArea() {
        return this.area;
    }
}
// END
