import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Ka� Adet Fibonnacci Say�s� G�rmek �stiyorsunuz?");
        int number=scn.nextInt();
        int first=0;
        int second=1;
        int third=first+second;
        
        System.out.println("Fibonacci Say�lar� ");   
        //d�ng� sayesinde seri yaz�lm��t�r.
            while(number>0){
            System.out.print(first+"+"+second+"="+third+ "\n"); 
            number--;        
            first=second;
            second=third;      
            third=first+second; 
             
              
          }   
        
    }

}


