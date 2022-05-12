package com.company;

import java.util.*;
import java.lang.*;
public class Main
{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        System.out.print(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
    }
}