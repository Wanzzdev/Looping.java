package looping_java;
import java.util.Scanner;
public class perulangan_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan = 1;
        
        while (bilangan != 0){
            System.out.print("Masukkan Bilangan 0 : ");
            bilangan = input.nextInt();
        }
    }
}
