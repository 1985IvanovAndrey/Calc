import java.util.Scanner;

public class Calc {

    static Scanner in = new Scanner(System.in);

    public static double getInt() {
        System.out.println("Введите число: ");
        double num;
        while (!in.hasNextDouble()) {
            if(in.next().charAt(0)=='q'){
                exit();
            }
            System.out.println("Вы ввели не число, повторите ввод:");
            in.next();
        }

        return num=in.nextDouble();
    }


    public static char getOperation() {
        System.out.println("Введите операцию: ");
        char oper=in.next().charAt(0);
        return oper;
    }
    public static void exit(){
        System.out.println("Программа калькулятор завершена");
        System.exit(0);
    }

    public static double calc(double num1, double num2, char znak) {
        double res;
        switch (znak) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
            case '%':
                res = num1 + (num1/100*num2);
                break;
            case 'q':
                exit();
            default:
                System.out.println("Неверно ввели операцию, повторите ввод:");
                res = calc(num1, num2, getOperation());
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор!\nДля выхода из программы в любой момент наберите \"q\"");
        double num1=getInt();
        double num2=getInt();
        //System.exit(0);
        char znak=getOperation();
        double rez=calc(num1,num2,znak);
        System.out.println("Результат равен="+rez);


    }
}



