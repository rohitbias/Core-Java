package datatypes;

import java.util.Scanner;

/*
boolean 1 byte
char 	2 byte
byte    1 byte
short   2 byte
int     4 byte
long    8 byte
float   4 byte
double  8 byte
*/

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String arr[] = new String[n];

        in.nextLine();

        for (int i = 0; i < n; i++){
            arr[i] = in.nextLine();
        }

        for (int i = 0; i < n; i++){
            try{
                long l = Long.parseLong(arr[i]);
                System.out.println(arr[i] + " can be fitted in:");

                if(l <= 127 && l >= -128){
                    System.out.println("* byte \n* short \n* int \n* long");
                }else if( l <= 32767 && l >= -32768){
                    System.out.println("* short \n* int \n* long");
                }else if ( l <= 2147483647 && l >= -2147483648){
                    System.out.println("* int \n* long");
                }else if(l <= 9223372036854775807l && l >= -9223372036854775808l){
                    System.out.println("* long");
                }

            }catch (NumberFormatException e){
                System.out.println(arr[i] + " can't be fitted anywhere.");
            }
        }


    }
}
