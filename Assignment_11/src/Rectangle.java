class Rectangle extends TwoD {
    private double length;
    private double width;
    private ShapeColor color;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.color = ShapeColor.BLACK;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void recolor(ShapeColor color) {
        this.color = color;
    }

    @Override
    public void display() {
        System.out.println("Rectangle with length: " + length + ", width: " + width + ", Color: " + color + " and Area: " + getArea());
    }
}
