
class Trapezoid extends TwoD {
    private double base1;
    private double base2;
    private double height;
    private ShapeColor color;

    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.color = ShapeColor.BLACK;
    }

    public double getBase1() {
        return base1;
    }

    public double getBase2() {
        return base2;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void recolor(ShapeColor color) {
        this.color = color;
    }
    @Override
    public void display() {
        System.out.println("Trapezoid with base1: " + base1 + ", base2: " + base2 + ", height: " + height + ", Color: " + color + " and Area: " + getArea());
    }
}
