package gr.upatras;

public class operations {

    public static String subtraction (int num1, int num2){
        int sub = num1 - num2;
        if (sub<0){
            return "negative";
        }
        else if (sub>0){
            return "positive";
        }
        else return "zero";
    }
}
