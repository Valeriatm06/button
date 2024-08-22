package co.edu.uptc;

import co.edu.uptc.models.CalculateData;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CalculateData cd = new CalculateData();
        System.out.println(cd.sum(3, 5));
    }
}