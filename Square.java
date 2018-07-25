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
    
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
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

