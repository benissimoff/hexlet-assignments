package exercise;

// BEGIN
class Circle {
    private int radius;

    private Point center;

    Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public double getSquare() throws NegativeRadiusException{
        if (this.radius < 0) {
//            System.out.println("Не удалось посчитать площадь");
            throw new NegativeRadiusException("");
        }

        double result = Math.PI * radius * radius;

        return result;
    }
}
// END
