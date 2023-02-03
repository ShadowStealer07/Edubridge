class Circle extends TwoD {
    private double radius;
    private ShapeColor color;

    public Circle(double radius) {
        this.radius = radius;
        this.color = ShapeColor.BLACK;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void recolor(ShapeColor color) {
        this.color = color;
    }

    @Override
    public void display() {
        System.out.println("Circle with radius: " + radius + ", Color: " + color + " and Area: " + getArea());
    }
}

