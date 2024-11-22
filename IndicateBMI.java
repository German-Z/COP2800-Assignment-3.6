import java.util.*;

public class IndicateBMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        double calculateWeight = (weight * 703);
        double height = (feet * 12 + inches);
        double bmi = calculateWeight / Math.pow(height, 2);

        System.out.println("BMI is " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 24.9)
            System.out.println("Normal");
        else if (bmi < 29.9)
            System.out.println("Overweight");
        else 
            System.out.println("Obesity");
    }
}
