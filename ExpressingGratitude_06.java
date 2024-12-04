import java.util.Scanner;

public class ExpressingGratitude_06 {
    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }

    public static void sayAdditionalGreetings(String additionalRemarks) {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+" for being best teacher in the world. \n"+
        "You inpired me in a love for learning and made me feel like I could ask you anything."+additionalRemarks);
    }

    public static void main(String[] args) {
        sayAdditionalGreetings(" Appreciate it!");
    }
}
