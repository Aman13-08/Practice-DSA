package dsa.Maths;

import java.util.Arrays;

public class ConvertTheTemperature {
    //Company -> Amazon ✯
//Question ->    You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
//    You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
//    Return the array ans. Answers within 10-5 of the actual answer will be accepted.
//  Kelvin = Celsius + 273.15
//    Fahrenheit = Celsius * 1.80 + 32.00

    public static double[] convertTemperature(double celsius) {
        double k = 0;
        double  f = 0;

        k = celsius +  273.15;
        f = celsius * 1.80 + 32.00;

        return new double[]{k,f};
    }
    public static void main(String[] args) {
        double celsius = 36.50;
        System.out.println(Arrays.toString(convertTemperature(celsius)));
    }
}
