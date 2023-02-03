
class Triangle extends TwoD {
    private double base;
    private double height;
    private ShapeColor color;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.color = ShapeColor.BLACK;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void recolor(ShapeColor color) {
        this.color = color;
    }

    @Override
    public void display() {
        System.out.println("Triangle with base: " + base + ", height: " + height + ", Color: " + color + " and Area: " + getArea());
    }
}
