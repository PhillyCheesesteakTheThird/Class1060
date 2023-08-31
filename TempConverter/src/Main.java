import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        TempConvert tempConvert = new TempConvert();

        System.out.println("Which way are you converting?");
        System.out.println("A) Celsius > Fahrenheit \nB) Fahrenheit > Celsius");

        String response = myObj.nextLine();
        String typeSelection;
        double inputNum;

        if (response.equalsIgnoreCase("A")){
            typeSelection = "A";
            System.out.println("Enter the value (C) to be converted:");


        }
        else {
            typeSelection = "B";
            System.out.println("Enter the value (F) to be converted:");


        }
        inputNum = Double.parseDouble(myObj.nextLine());
        System.out.println(tempConvert.convert(inputNum, typeSelection));

    }
}