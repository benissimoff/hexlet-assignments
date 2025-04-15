package exercise;

// BEGIN
class Segment {
    private Point pointA;
    private Point pointB;
    public Segment(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Point getBeginPoint() {
        return this.pointA;
    }

    public Point getEndPoint() {
        return this.pointB;
    }

    public Point getMidPoint() {
        int middleX = (this.pointA.getX() + this.pointB.getX()) / 2;
        int middleY = (this.pointA.getY() + this.pointB.getY()) / 2;

        return new Point(middleX, middleY);
    }
}
// END
