package podstawy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        System.out.println(decToBinaryWrongDirection(79));
        reverse2(decToBinaryWrongDirection(79));

//        String path = "C:\\Users\\Marcin\\Desktop\\różne\\test.txt";
//        System.out.println(howManyRows(path));


    }

    public static String decToBinaryWrongDirection(int c){
        String result = "" ;
        for(int i=0; c > 0; i++){
            if(c % 2 == 0){
                c = c/2;
                result += "0";
            }else{
                c = c/2;
                result += "1";
            }
        }
        return result;
    }

    public static int howManyRows(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        int rows = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            rows++;
        }
        return rows;
    }


    public static char[] stringToArray(String n){
        char[] array = new char[n.length()];
        for (int i = 0; i < n.length(); i++) {
            array[i]=n.charAt(i);
        }
        return array;
    }

    public static void reverseBinary(char[] array){
        String wynik = "";
        for (int i = array.length-1; i>=0; i--) {
            wynik+=array[i];
        }
        System.out.println(wynik);
    }

    public static void reverse2(String n){

        StringBuilder sb = new StringBuilder();
        sb = sb.append(n);


        System.out.println(sb.reverse());
    }

}
