package SecondLection;

public class Square extends Shape {
    //For square AB = CD = BC = AD

    private Point p1 = new Point();
    private Point p2 = new Point();
    private Point p3 = new Point();
    private Point p4 = new Point();
    private double AB;

    public Square(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        AB = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        if (p3.getX() - p1.getX() != p3.getY() - p1.getY()) {
            System.out.println(String.format("Square doesn't exists with such points. One side doesn't match another. A=%f, B=%f", (p3.getX() - p1.getX()), (p3.getY() - p1.getY())));
        }

    }

    public Square() {
    }

    public double getPerimeter() {
        if (p3.getX() - p1.getX() == p3.getY() - p1.getY()) {
            return AB * 4;
        }
        return 0;
    }

    public double getArea() {
        if (p3.getX() - p1.getX() == p3.getY() - p1.getY()) {
            return Math.pow(AB, 2);
        }
        return 0;
    }

    @Override
    public String toString() {

        return "Square{" +
                "perimeter =" + getPerimeter() +
                ", area = " + getArea() +
                '}';
    }
}

