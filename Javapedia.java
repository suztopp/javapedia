import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("Hi there, how many historical figures will you register?");
        int figures = scan.nextInt();

        String[][] database = new String[figures][3];   

        scan.nextLine();      
         
        for (int i = 0; i < database.length; i++) {

            System.out.println("\n\tFigure " + (i+1));
            System.out.println("\t - Name: ");
            database[i][0] = scan.nextLine();
            System.out.println("\t - Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.println("\t - Occupation: ");
            database[i][2] = scan.nextLine();
        }

        for (int i = 0; i < database.length; i++) {
            System.out.println();
        }
        
        System.out.println("These are the values you stored:"); 
        print2DArray(database); 

        System.out.print("\nWho do you want information on? ");  
        String searchName = scan.nextLine();

        for (int i  = 0; i < database.length; i++) {
            if (database[i][0].equals(searchName)) {
                System.out.println("\t - Name: " + database[i][0]);
                System.out.println("\t - Date of birth: " + database[i][1]);
                System.out.println("\t - Occupation: " + database[i][2]);
            }
        }     

        scan.close();
    }

    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + " " + array[i][1] + " " + array[i][2]);
        }
    }

}
