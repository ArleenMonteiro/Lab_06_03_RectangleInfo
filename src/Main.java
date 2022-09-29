import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner in= new Scanner(System.in);

        double Length= 0;
        double Breadth=0;
        String trash="";

        System.out.print("Enter the length of the rectangle: ");
        if(in.hasNextDouble())
        {
            Length=in.nextDouble();
            in.nextLine();
            System.out.println("You said the length of the rectangle is: " + Length);

        }
        else
        {
            trash=in.nextLine();
            System.out.println(trash + " is an invalid response.");
            System.exit(0);
        }

        System.out.print("Enter the breadth of the rectangle: ");
        if(in.hasNextDouble())
        {
            Breadth=in.nextDouble();
            in.nextLine();
            System.out.println("You said the breadth of the rectangle is: " + Breadth);

        }
        else
        {
            trash=in.nextLine();
            System.out.println(trash + " is an invalid response.");
            System.exit(0);
        }

        System.out.println("The area of the rectangle is: " + Length*Breadth);
        System.out.println("The perimeter of the rectangle is: " + (2*Length + 2*Breadth));
        double diagonal=Math.sqrt(Length*Length + Breadth*Breadth);
        System.out.println("The diagonal of the rectangle is: "+ diagonal);


    }
}