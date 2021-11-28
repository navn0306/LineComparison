package com.bridge.LineComparison;

import java.util.Scanner;
import java.lang.Math;

public class LineComparision {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter corndinates of 1st point of 1st line:- ");
        System.out.println("x:- ");
        x1 = sc.nextInt();
        System.out.println("y:- ");
        y1 = sc.nextInt();
        System.out.println("Enter corndinates of 2nd point of 1st line:- ");
        System.out.println("x:- ");
        x2 = sc.nextInt();
        System.out.println("y:- ");
        y2 = sc.nextInt();
        Cordinates cordinatesOfLine1 = new Cordinates(x1, y1, x2, y2);
        System.out.println("Enter corndinates of 1st point of 2nd line:- ");
        System.out.println("x:- ");
        x1 = sc.nextInt();
        System.out.println("y:- ");
        y1 = sc.nextInt();
        System.out.println("Enter corndinates of 2nd point of 2nd line:- ");
        System.out.println("x:- ");
        x2 = sc.nextInt();
        System.out.println("y:- ");
        y2 = sc.nextInt();
        Cordinates cordinatesOfLine2 = new Cordinates(x1, y1, x2, y2);
        cordinatesOfLine1.compareLength(cordinatesOfLine2);
    }

    private static class Cordinates {
        int x1, y1, x2, y2;
        Cordinates(int x1, int y1, int x2, int y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public void compareLength(Cordinates cordinates) {
            Double lengthOfLine1 = Math.sqrt(Math.pow((this.x2 - this.x1),2) + Math.pow((this.y2 - this.y1),2)),
                    lengthOfLine2 = Math.sqrt(Math.pow((cordinates.x2 - cordinates.x1),2) + Math.pow((cordinates.y2 - cordinates.y1),2));

            if(lengthOfLine1.compareTo(lengthOfLine2) == 0) {
                System.out.println("Both lines have equal length!");
            } else if(lengthOfLine1.compareTo(lengthOfLine2) > 0) {
                System.out.println("1st line is greater than 2nd line!");
            } else {
                System.out.println("2nd line is greater than 1st line!");
            }
        }
    }
}
