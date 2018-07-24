package SecondLection;

public class Triangle extends Shape {

    private Point p1;
    private Point p2;
    private Point p3;
    private double AB;
    private double BC;
    private double AC;
    private double perimeter;
    private double area;
    private String str;

    public Triangle(Point p1, Point p2, Point p3) {
        if (AB + BC <= AC || AB + AC <= BC || BC + AC <= AB) {
            System.out.println(String.format("Triangle doesn't exists with such points. One side bigger then other two. Points: p1 = %s = p2 = %s p3 = %s.", p1, p2, p3));
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    public Triangle() {
    }

    public double getPerimetr() {
        AB = Math.sqrt((Math.pow(p2.getX() - p1.getX(), 2)) + (Math.pow(p2.getY() - p1.getY(), 2)));
        BC = Math.sqrt((Math.pow(p3.getX() - p2.getX(), 2)) + (Math.pow(p3.getY() - p2.getY(), 2)));
        AC = Math.sqrt((Math.pow(p3.getX() - p1.getX(), 2)) + (Math.pow(p3.getY() - p1.getY(), 2)));
        if (AB + BC > AC || AB + AC > BC || BC + AC > AB) {
            perimeter = AB + BC + AC;
        }
        return perimeter;
    }

    public double getArea() {
        if (AB + BC > AC || AB + AC > BC || BC + AC > AB) {
            area = Math.abs(0.5 * ((p1.getX() - p3.getX()) * (p2.getY() - p3.getY()) - (p2.getX() - p3.getX()) * (p1.getY() - p3.getY())));
        } else {
            area = 0;
        }


        return area;
    }

    @Override
    public String toString() {

        return "Triangle{" +
                "perimeter =" + getPerimetr() +
                ", area = " + getArea() +
                '}';

    }
}