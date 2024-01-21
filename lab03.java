import java.util.Scanner;

public class lab03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Step 1: Input
        System.out.print("Enter Card Number (1-52): ");
        int cardNumber = s.nextInt(); 

        String suit = "";
        String role = "";

        //Step 2: Validation
        if (cardNumber < 1 || cardNumber > 52) {
            System.out.println("Invalid card number. ");
            System.exit(0);
        } else {
            //Step 3:Determine Suit
            int suitNumber = (cardNumber -1) / 13 ;

            if (suitNumber == 0) {
                suit = " Clubs";
            } else if (suitNumber == 1) {
                suit = " Diamonds";
            } else if (suitNumber == 2) {
                suit = " Hearts";
            } else {
                suit = " Spades";
            }

            //Step 4: Determine Role
            if(cardNumber == 13 || cardNumber == 26 || cardNumber == 39 || cardNumber == 52){
                role = "King of ";
            } else if(cardNumber == 12 || cardNumber == 25 || cardNumber == 38 || cardNumber == 51){
                role = "Queen of ";
            } else if(cardNumber == 11 || cardNumber == 24 || cardNumber == 37 || cardNumber == 50){
                role = "Jack of ";
            } else if(cardNumber == 1 || cardNumber == 14 || cardNumber == 27 || cardNumber == 40){
                role = "Ace of ";
            } else {
                role = String.valueOf(cardNumber % 13);
            }
        }

        //Step 5: Output
        System.out.println("The card you picked is " + role + suit);
        s.close();
    }
}
