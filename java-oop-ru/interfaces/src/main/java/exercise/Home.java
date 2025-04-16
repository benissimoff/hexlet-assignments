package exercise;

// BEGIN
interface Home {
    double getArea();

    default int compareTo(Home anotherHome) {
        double thisArea = this.getArea();
        double anotherArea = anotherHome.getArea();

        if (thisArea > anotherArea) {
            return 1;
        } else if (thisArea < anotherArea) {
            return -1;
        }

        return 0;
    }
}
// END
