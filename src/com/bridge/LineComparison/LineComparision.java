package com.bridge.LineComparison;

import java.util.Scanner;
import java.lang.Math;

public class LineComparision {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter corndinates of 1st point of line:- ");
        System.out.println("x:- ");
        x1 = sc.nextInt();
        System.out.println("y:- ");
        y1 = sc.nextInt();
        System.out.println("Enter corndinates of 2nd point of line:- ");
        System.out.println("x:- ");
        x2 = sc.nextInt();
        System.out.println("y:- ");
        y2 = sc.nextInt();
        Cordinates cordinates = new Cordinates(x1, y1, x2, y2);
        System.out.println("Length of line is:- " +cordinates.calculateLength()+" Units");
    }

    private static class Cordinates {
        int x1, y1, x2, y2;
        Cordinates(int x1, int y1, int x2, int y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public double calculateLength() {
            return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        }
    }
}
