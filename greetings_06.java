import java.util.Scanner;

public class greetings_06 {
   /*  public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();

        String greeting = "Thank you "+recipientName+" May the force be with you!";
        return greeting;
    } */
   public static void getGreetingRecipient(String name) {
    System.out.println("Thank you "+name+" May the force be with you!");
   }

    public static void main(String[] args) {
      /*  System.out.println(getGreetingRecipient()); */
        Scanner input = new Scanner(System.in);

        System.out.print("Input the name of people you want to greet : ");
        String getname = input.nextLine();
        getGreetingRecipient(getname);

        input.close();
    }
}
