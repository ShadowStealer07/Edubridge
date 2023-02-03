class Tetrahedron extends ThreeD {
    private double side;

    public Tetrahedron(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * side * side;
    }

    @Override
    public double getVolume() {
        return (1.0 / 12.0) * Math.sqrt(2) * side * side * side;
    }

    @Override
    public void resize(double percentage) {
        side *= (1 - percentage);
    }

    @Override
    public void display() {
        System.out.println("Tetrahedron with side: " + side + " and Volume: " + getVolume());
    }
}