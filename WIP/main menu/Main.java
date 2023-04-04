import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner optionChecker = new Scanner(System.in);
        System.out.println("Select an option");
        System.out.println("Your options are:");
        System.out.println("1: Option1");
        System.out.println("2: Option2");
        String userInput;
        //int userOption1 = 1;
        //int userOption2 = 2;
        //Option1.printOption1();
        //Option2.printOption2();

        userInput = optionChecker.nextLine();
        // if (userInput == "1") {
        //     Option1.printOption1();
        // }   
        // if (userInput == "2") {
        //     Option2.printOption2();
        // }    
        switch(userInput){
            case "1":
                Option1.printOption1();
                break;
            case "2":
                Option2.printOption2();
                break;
            default:
                System.out.println("An error occured");
        }


    }
}