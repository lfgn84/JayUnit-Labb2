import java.util.Scanner;

public class Controller {
    int op;

    public Controller() {
        Scanner sc = new Scanner(System.in);
        do {
             op = 0;
            System.out.println("Enter a number : ");
            int x = sc.nextInt();
            System.out.println("1. Add \n2. Rest \n3.Multiply \n4.Divide \n5.PCT\n6.Exit ");
            op = sc.nextInt();
            if (op > 0 && op <= 6) {
                if (op == 5) {
                    x = x / 100;
                    System.out.println(x + "\n");
                    System.out.println("1. Add \n2. Rest \n3.Multiply \n4.Divide \n5.PCT\n6.Exit ");
                    op = sc.nextInt();
                }
                if(op == 6){
                    System.exit(0);
                }

            } else do {
                System.out.println("Wrong option \n");
                System.out.println("1. Add \n2. Rest \n3.Multiply \n4.Divide \n5.PCT\n6.Exit ");
                op = sc.nextInt();
                if(op == 6){
                    System.exit(0);
                }
            } while (op > 6 || op <= 0);

            System.out.println("Enter a number ");
            int y = sc.nextInt();

            double a = calc(x, y, op);
            String oper = "";
            switch (op){
                case 1:
                    oper = "+";
                    break;
                case 2:
                    oper = "-";
                    break;
                case 3:
                    oper = "*";
                    break;
                case 4:
                    oper = "/";
                    break;
                case 5:
                    oper = "%";
                    break;
            }
                System.out.println( x+" "+oper +" "+y+" "+" = "+a);


        } while (true);

    }
        public  double calc(int x, int y, int op){
            Calculator calculator = new Calculator();
            double a = 0;
            switch (op) {
                case 1:
                    a = calculator.sum(x, y);
                    break;
                case 2:
                    a = calculator.rest(x, y);
                    break;
                case 3:
                    a = calculator.multiply(x, y);
                    break;
                case 4:
                    a = calculator.divide(x, y);
                    break;
                case 5:
                    a = calculator.pct(x);
                    break;

                }
            return a;
        }

    }




