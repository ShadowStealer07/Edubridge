class Cube extends ThreeD {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public void resize(double percentage) {
        side *= (1 - percentage);
    }

    @Override
    public void display() {
        System.out.println("Cube with side: " + side + " and Volume: " + getVolume());
    }
}