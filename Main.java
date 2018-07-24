package SecondLection;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(4, 3);
        Point p2 = new Point(10, 3);
        Point p3 = new Point(10, 9);
        Point p4 = new Point(4, 9);
        Triangle t = new Triangle(p1, p2, p3);
        Board b = new Board();

        Square s = new Square(p1, p2, p3, p4);
        Square s2 = new Square(p2, p1, p3, p4);
        b.addShape(t, 0);
        b.addShape(s, 3);

        //Trying to add an element to a part where an element already exist. Will recieve and error.
        b.addShape(t, 3);

        b.addShape(s2, 1);


        //ArrayIndexOutOfBoundsException
        b.addShape(t, 2);//

        System.out.println(b + " Total elements area = " + b.getSumArea());
    }
}
