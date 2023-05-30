package gr.aueb.cf.ch6;


import java.util.Scanner;

/**
 * ilopoiei enan aplo calculator pou parexi tis ipiresies
 * add,sub,mul,dic,mod
 * emfanizei ena menu pros ton xristi me epiloges lambani tin timh tis epilogis kai sthn synexeia
 * duo akoma times tvn num1,num2
 * telika emfanizei to apotelesma
 */
public class CalculatorApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;
      do {
          printMenu();
          choice = getNextInt("please insert your choice");


          if (isChoiceInvalid(choice)) {
              System.out.println("Choice is invalid");
              continue;
          }
           if (isChoiceQuit(choice)) {
               break;
           }
          result = onChoiceGetResult(choice);
          System.out.println("Result = " + result);
      }while (true);
    }
   public static void printMenu() {
       System.out.println("epilexte ena apo ta parakato");
       System.out.println("prosthesi");
       System.out.println("aferesi");
       System.out.println("polaplasiasmow");
       System.out.println("dieresi");
       System.out.println("ipolipo");
       System.out.println("exodos");
   }

   public static int getNextInt (String message) {
       System.out.println(message);
       return in.nextInt();
   }

   public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
   }
   public static boolean isChoiceQuit (int choice) {
        return choice == 6;
   }

   public static int add(int num1, int num2) {
        return num1 + num2;
   }
    public static int sub(int num1, int num2) {
        return num1 - num2;
    }
    public static int mul(int num1, int num2) {
        return num1 * num2;
    }
    public static int div(int num1, int num2) {
        int value = 0;
        if (num2 == 0) {
            value = Integer.MAX_VALUE;
        }else {
            value = num1 / num2;
        }
        return value;
    }
    public static int mod(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 % num2;
    }

    public static int onChoiceGetResult(int choice){

        int num1 = getNextInt("please insert the first number(int)");
        int num2 = getNextInt("please insert the second number(int)");
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
            break;
            case 4:
                result = div(num1, num2);
                break;
                case 5:
                  result = mod(num1, num2);
                  break;
            case 6:
            default:
                break;
        }

        return result;
    }







}
