import java.util.Scanner;

public class switchcase {

	public static void main(String args[]){
		   int month = 2;
	        String monthString;
	        switch (month) {
	            case 1:  monthString = "Януари";
	                     break;
	            case 2:  monthString = "Февруари";
	                     break;
	            case 3:  monthString = "Март";
	                     break;
	            case 4:  monthString = "Април";
	                     break;
	            case 5:  monthString = "Май";
	                     break;
	            case 6:  monthString = "Юни";
	                     break;
	            case 7:  monthString = "Юли";
	                     break;
	            case 8:  monthString = "Август";
	                     break;
	            case 9:  monthString = "Септември";
	                     break;
	            case 10: monthString = "Октомври";
	                     break;
	            case 11: monthString = "Ноември";
	                     break;
	            case 12: monthString = "Декември";
	                     break;
	            default: monthString = "Няма такъв месец";
	                     break;
	        }
	        System.out.println(monthString);
	    }
	}