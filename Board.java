package SecondLection;

import java.util.Arrays;

public class Board {
    Shape[] arr = new Shape[4];
    public Board(Shape[] arr) {
        this.arr = arr;
    }

    public Board() {
    }


    public void addShape(Shape shape, int part) {
        try {
            if (arr[part] != null) {
                System.out.println(String.format("The shape wasn't added. There is aleady one on this part of the board (part %d). First delete it!", part));

            } else {
                arr[part] = shape;
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("You are trying to add a shape to an not existing part of board ");
        }
    }

    public void delShape(int part) {
        try {
            arr[part] = null;
            System.out.println(String.format("The shape has been deleted from part number %d of the board. Now you can add new Shape there.", part));
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("You are trying to add a Shape to an not existing part of board ");
        }
    }

    public double getSumArea() {
        double sumArea = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getArea() != 0) {
                sumArea = arr[i].getArea() + sumArea;
            }
        }
        return sumArea;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getArea() != 0) {
                s = s + "Part " + i + " of a board: " + arr[i] + ". ";
            } else {
                s = s + "Part " + i + " is empty. ";

            }
        }
        return s;
    }

}
