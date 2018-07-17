import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        float number1, number2;
        char operator;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Избери действие: [+ - * / ]: ");
        operator = input.nextLine().charAt(0);
        
        System.out.print("Кое ще е първото число: ");
        number1 = input.nextFloat();
        System.out.print("Кое ще е второто число: ");
        number2 = input.nextFloat();	
        System.out.println();
        
        switch( operator )	
        {
            case '+':
                System.out.printf("%.4f + %.4f = %.4f", number1, number2, number1 + number2);
                break;        
                
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", number1, number2, number1 - number2);
                break;
                
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", number1, number2, number1 * number2);
                break;
                
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", number1, number2, number1 / number2);
                break;
            
            default:
                System.out.printf("Грешка!");        
            
        }
        

    }
}
