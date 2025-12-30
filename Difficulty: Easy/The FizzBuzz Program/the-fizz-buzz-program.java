import java.util.Scanner;

class GFG {

    public static void main(String[] args) {
        // code here
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter number");
    int num=sc.nextInt();
    
     if(num%3==0 && num%5==0)
    System.out.println("FizzBuzz");
   else if(num%3==0)
    System.out.println("Fizz");
    else if(num%5==0)
    System.out.println("Buzz");
    else
    System.out.println(num);
    
        sc.close();
    
    }
    
}
