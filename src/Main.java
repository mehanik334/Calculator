
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int answer=0;
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();
        exp.trim();
        in.close();
        Worker worker=new Worker(exp);
        worker.stringToDigit();
        int num1=worker.getNum1();
        int num2=worker.getNum2();
        char operator = worker.getOperator();
        if(num2!=0) {
            switch (operator) {

                case '+':
                    answer = num1 + num2;
                    break;

                case '-':
                    answer = num1 - num2;
                    break;

                case '*':
                    answer = num1 * num2;
                    break;

                case '/':
                    answer = num1 / num2;
                    break;
            }
            System.out.println(answer);

        }else
            System.out.println("Деление на ноль невозможно");

    }





}




