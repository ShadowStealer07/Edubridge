import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Shape> shapes = new ArrayList<>();
        while (true) {
            int k = rand.nextInt(3);
            if (k == 0) {
                break;
            } else if (k == 1) {
                shapes.add(generateTwoD());
            } else if (k == 2) {
                shapes.add(generateThreeD());
            }
        }
        for (Shape s : shapes) {
            s.display();
            if (s instanceof TwoD) {
                TwoD twoD = (TwoD) s;
                twoD.recolor(generateColor());
            } else if (s instanceof ThreeD) {
                ThreeD threeD = (ThreeD) s;
                double sizeReduction = generateDouble();
                threeD.resize(sizeReduction);
            }
            System.out.println("Updated info:");
            s.display();
            System.out.println("---------------------------------");
        }
    }

    public static int generateInt() {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        return num;
    }

    public static double generateDouble() {
        Random rand = new Random();
        double num = (rand.nextInt(100) + 1) * 0.01;
        return num;
    }

    public static TwoD generateTwoD() {
        int num = generateInt();
        switch (num % 4) {
            case 0:
                return new Circle(generateInt());
            case 1:
                return new Rectangle(generateInt(), generateInt());
            case 2:
                return new Triangle(generateInt(), generateInt());
            default:
                return new Trapezoid(generateInt(), generateInt(), generateInt());
        }
    }

    public static ThreeD generateThreeD() {
        int num = generateInt();
        switch (num % 3) {
            case 0:
                return new Sphere(generateInt());
            case 1:
                return new Cube(generateInt());
            default:
                return new Tetrahedron(generateInt());
        }
    }

    public static ShapeColor generateColor() {
        Random rand = new Random();
        int num = rand.nextInt(ShapeColor.values().length);
        return ShapeColor.values()[num];
    }
}

interface Shape {
    double getArea();
	void display();
}

interface Resizeable {
    void resize(double percentage);

	double getVolume();
}

interface Recolorable {
    void recolor(ShapeColor color);
}

enum ShapeColor {
    RED, GREEN, BLUE, BLACK, WHITE
}