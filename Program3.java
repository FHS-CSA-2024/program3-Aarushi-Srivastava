//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class program3{
    public static void main( String[]args){
        int length=0;
        int width= 0;
        int area= 0;
        int perimenter= 0;
        
        Scanner numScanner = new Scanner(System.in);//create scanner
        
        System.out.println("Enter the length:");
        length=numScanner.nextInt();
        
        System.out.println("Enter the width:");
        width=numScanner.nextInt();
        
        System.out.println("The Length is: " + length);
        System.out.println("The Width is: " + width);
        
        System.out.println("The Area is: "+ (length*width));
        System.out.println("The Perimenter is: " + ((2*length)+(2*width)));
        
    }
}



//Paste console output below:
/*


*/
