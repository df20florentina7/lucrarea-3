import java.util.Scanner;

public class Main {
    final static int PRICE_1_GUESS = 35;
    final static int GUESTS = 50;

    public static void main(String[] args) {
        int guests;
        guests=numGuests();
        totalPrice(guests);
    }

    public static int numGuests() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("the number of guests is:");
        return inputDevice.nextInt();
    }

    public static void totalPrice(int numGuests) {
        int price = numGuests * PRICE_1_GUESS;
        System.out.println("The price for one guest is: " + PRICE_1_GUESS + " and the price for all the guests is: " + price);
        if (numGuests > GUESTS) {
            System.out.println("The event is a big event");
        }
        else System.out.println("The event is not a big event");
    }
}