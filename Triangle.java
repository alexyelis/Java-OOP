package SecondLection;

public class Triangle extends Shape {

    private Point p1;
    private Point p2;
    private Point p3;
    private double AB;
    private double BC;
    private double AC;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        AB = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + (Math.pow(p2.getY() - p1.getY(), 2)));
        BC = Math.sqrt(Math.pow(p3.getX() - p2.getX(), 2) + (Math.pow(p3.getY() - p2.getY(), 2)));
        AC = Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + (Math.pow(p3.getY() - p1.getY(), 2)));
        if (AB + BC <= AC || AB + AC <= BC || BC + AC <= AB) {
            System.out.println(String.format("Triangle doesn't exists with such points. One side bigger then other two. A=%f, B=%f, C=%f", AB, BC, AC));

        }
    }

    public Triangle() {
    }
    
    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public double getPerimeter() {

        if (AB + BC > AC || AB + AC > BC || BC + AC > AB) {
            return AB + BC + AC;
        }
        return 0;
    }

    public double getArea() {
        if (AB + BC > AC || AB + AC > BC || BC + AC > AB) {
            return Math.abs(0.5 * ((p1.getX() - p3.getX()) * (p2.getY() - p3.getY()) - (p2.getX() - p3.getX()) * (p1.getY() - p3.getY())));
        }

        return 0;
    }

    @Override
    public String toString() {

        return "Triangle{" +
                "perimeter =" + getPerimeter() +
                ", area = " + getArea() +
                '}';

    }
}
