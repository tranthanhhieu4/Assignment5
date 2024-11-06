//Fibonacci Sequence
package bailecture6;

import java.util.Scanner;
public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.print("Nhap so luong so:");
        int n =scanner.nextInt();
        int firstTerm=0, secondTerm=1;
        System.out.print("Day Fibonacci:"+firstTerm+","+secondTerm);
        for (int i=3;i<=n;i++){
            int nextTerm=firstTerm+secondTerm;
            System.out.print(","+nextTerm);
            firstTerm=secondTerm;
            secondTerm=nextTerm;
            
            
        }
        System.out.println();
        
        
    }
}
