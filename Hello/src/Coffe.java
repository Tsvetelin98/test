import java.util.Scanner;

public class Coffe {
    public static void main(String[] args) {

           float number1, number2;
           char operator;
           Scanner input = new Scanner(System.in);
           
           System.out.print("Искаш ли кафе?:         +(yes)     -(no) ");
           operator = input.nextLine().charAt(0);
           
           System.out.print("Колко кафета?:");
           number1 = input.nextFloat();
           System.out.print("а за колегата?: ");
           number2 = input.nextFloat();
           System.out.println();
           
           switch( operator )
           {
               case '+':
                   System.out.printf("Супер , идват след малко!:)", number1);
                   break;        
                   
               case '-':
                   System.out.printf("Нали каза че не искаш?",number2);
                   break;
                   
               
               
               default:
                   System.out.printf("Грешка!");        
               
           }
           

       }
   }
   
    	
