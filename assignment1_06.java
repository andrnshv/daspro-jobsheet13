import java.util.Scanner;

public class assignment1_06 {

    static int calculateArea(int s) {
        int area = 6 * s * s;
        return area;
    }

    static int calculateVolume(int s) {
        int vol = s * s * s;
        return vol;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int s, area, volume;

        System.out.print("Input side length of the cube = ");
        s = input.nextInt();
        input.close();

        area = calculateArea(s);
        System.out.println("Area of the cube = " + area);
        volume = calculateVolume(s);
        System.out.println("Volume of the cube = " + volume);
    }  
}
