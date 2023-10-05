public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade (int grade) {
        if (grade>=90){
            return 'A';
        }if ((grade>=80) && (grade<=89)){
            return 'B';
        }if ((grade>=70) && (grade<=79)) {
            return 'C';
        }if ((grade>=60) && (grade<=69)){
            return 'D';
        }if ((grade>=50) && (grade<=59)){
            return 'E';
        }return 'F';
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int argument){
        if ((argument%15)==0){
            return "fizzbuzz";
        }if ((argument%3)==0){
            return "fizz";
        }if ((argument%5)==0){
            return "buzz";
        }return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String argument){
        if (argument.length()<2){
            return argument;
        }String twoChars = argument.substring(0,2);
        return twoChars+argument+twoChars;
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if ((a+b)==c){
            return true;
        }if ((a+c)==b){
            return true;
        }if ((c+b)==a){
            return true;
        }return false;
    }
    // Question 5 - endUp
    public static String endUp(String argument){
        if (argument.length()<3){
            return argument.toUpperCase();
        } String front = argument.substring(0,(argument.length()-3));
        String back = (argument.substring((argument.length()-3),(argument.length()))).toUpperCase();
        return front+back;
    }

}
