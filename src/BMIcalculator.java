import java.util.Scanner;


public class BMIcalculator {

    public static void main(String[] args) throws Exception {
        calculateBMI();

        int weight = 700;
        if (weight >= 700) {
            System.out.println("Incorrect weight");
        }
        int height = 270;
        if (height >=270) {
            System.out.println("Incorrect height");
        }
    }

    private static void calculateBMI() throws Exception {
        System.out.print("Please enter your weight in kg: ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        System.out.print("Please enter your height in cm: ");
        float height = s.nextFloat();


        float bmi = (100*100*weight)/(height*height);

        System.out.println("Your BMI is: "+bmi);
        printBMICategory(bmi);

    }

    private static void printBMICategory(float bmi) {
        if(bmi < 18.5) {
            System.out.println("You are underweight");
        }else if (bmi < 25) {
            System.out.println("You are normal");
        }else if (bmi < 30) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obese");
        }
    }
}