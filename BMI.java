import java.util.Scanner;

public class BMI {
    public static void main(String[] args) throws Exception {
        calculateBMI();

    }
    private static void calculateBMI() throws Exception{

        System.out.println("Please enter your weight in kg");
        Scanner s = new Scanner(System.in);
        float weight = s. nextFloat();
        System.out.println("Please enter your height in cm");
        float height = s.nextFloat();

        float bmi = (100*100*weight)/(height*height);
        System.out.println("Your BMI is:" + bmi);
        printBMICategory(bmi);

    }
    private static void printBMICategory(float bmi){
        if(bmi<18.5){
            System.out.println("Your are underweight");
        }
        else if (bmi < 25){
            System.out.println("Your are  normal");
        }
        else if (bmi < 30){
            System.out.println("Your are overweight");
        }
        else {
            System.out.println("You are obese");
        }
    }

}