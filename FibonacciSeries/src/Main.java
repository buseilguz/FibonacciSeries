import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Kaç Adet Fibonnacci Sayýsý Görmek Ýstiyorsunuz?");
        int number=scn.nextInt();
        int first=0;
        int second=1;
        int third=first+second;
        
        System.out.println("Fibonacci Sayýlarý ");   
        //döngü sayesinde seri yazýlmýþtýr.
            while(number>0){
            System.out.print(first+"+"+second+"="+third+ "\n"); 
            number--;        
            first=second;
            second=third;      
            third=first+second; 
             
              
          }   
        
    }

}


