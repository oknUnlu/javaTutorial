package day1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // If-else
        int age = 20;
        if (age > 18){
            System.out.println("Age is greater than 18");
        }

        int number=20;
        //Using ternary operator
        String output=(number%2==0)?"even number":"odd number";
        System.out.println(output);

        //Switch expression
        switch(number){
            //Case statements
            case 10: System.out.println("10");
                break;
            case 20: System.out.println("20");
                break;
            case 30: System.out.println("30");
                break;
            //Default case statement
            default:System.out.println("Not in 10, 20 or 30");
        }

        // For Loop
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        // While Loop
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        // Do While
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
        // Break
        for(i=1;i<=10;i++){
            if (i == 3) break;
            System.out.println(i);
        }
        // Continue
        for(i=1;i<=10;i++){
            if (i == 3) continue;
            System.out.println(i);
        }
        // Comments
        //This is single line comment
    }
}