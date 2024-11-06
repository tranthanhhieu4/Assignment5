//Number Guessing Game
package bailecture6;
import java.util.Random;
import java.util.Scanner;

        

public class BaiTap1 {
public static void main(String[] args) {
        Random random=new Random();
        int targetNumber=random.nextInt(50)+1;
        int guess=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hay doan mot so tu 1 den 50:");
        while(guess!= targetNumber){
            System.out.print("Nhap so ban doan:");
            guess=scanner.nextInt();
            if(guess <targetNumber){
                System.out.println("So ban nho hon");
            }else if(guess>targetNumber){
                System.out.println("So ban lon hon");
            }else{
                System.out.println(" Xin chuc mung ban da doan trung");
            }
        }
    }
    
}
