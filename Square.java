package SecondLection;

public class Square extends Shape {
    //For square AB = CD = BC = AD

    private Point p1 = new Point();
    ;
    private Point p2 = new Point();
    ;
    private Point p3 = new Point();
    ;
    private Point p4 = new Point();
    ;
    private double AB;
    private double perimeter;
    private double area;

    public Square(Point p1, Point p2, Point p3, Point p4) {
        if (p3.getX() - p1.getX() != p3.getY() - p1.getY()) {
            System.out.println(String.format("Square doesn't exists with such points. One side doesn't equals to another one. Points: p1 = %s = p2 = %s p3 = %s p4 = %s. ", p1, p2, p3, p4));

        } else {

            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;

            AB = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        }

    }

    public Square() {
    }

    public double getPerimetr() {
        if (p3.getX() - p1.getX() == p3.getY() - p1.getY()) {
            perimeter = AB * 4;
        }
        return perimeter;
    }

    public double getArea() {
        if (p3.getX() - p1.getX() == p3.getY() - p1.getY()) {
            area = Math.pow(AB, 2);
        }
        return area;
    }

    @Override
    public String toString() {

        return "Square{" +
                "perimeter =" + getPerimetr() +
                ", area = " + getArea() +
                '}';
    }
}

