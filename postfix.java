
import java.util.Scanner;
import java.util.Stack;


public class postfix {

/**
     * @param args
 * @Abdulrahman 
 */
  public static void main(String[] args) {
        
  Scanner in = new Scanner(System.in); 

  System.out.println("The Postfix notation is used to represent algebraic expressions."
          + "  \nEx: "
          + "\n 6 2 / 3 + --> 6 \n 10 4 - 3 / 2 * --> 4");
  System.out.print("Write here: ");
  postfix(in.nextLine());

  
       
}
 public static void postfix(String expr){ 
     
 Stack<Double> s = new Stack<Double>(); 
    double E1=0,E2=0;
    String[] arr = expr.split(" ");
     
        for(String ch : arr){  
        if(ch.equals("+")||ch.equals("-")|| ch.equals("*")||ch.equals("/") ){
            E2 = s.pop();
            E1 = s.pop();
            switch(ch){
                     case "+":
                    s.push(E1+E2);
                    break;
                     
                    case "-":
                    s.push(E1-E2);
                    break;
                     
                    case "/":
                    s.push(E1/E2);
                    break;
                     
                    case "*":
                    s.push(E1*E2);
                    break;
        }
        }else{
            s.push(Double.parseDouble(ch));
        }
        }
        
 System.out.println(s.peek());    

 }
}