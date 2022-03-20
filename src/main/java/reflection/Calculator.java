package reflection;

    public class Calculator {
        public void sum(int a,int b){
            int res = a + b;
            System.out.println("Сумма " + a + " и " + b + " = " + res );
        }
        public void subtraction(int a,int b){
            int res = a - b;
            System.out.println("Разница " + a + " и " + b + " = " + res );
        }
        public void multiplication(int a,int b){
            int res = a * b;
            System.out.println("Умножение " + a + " и " + b + " = " + res );
        }
        public void division(int a, int b){
            int res = a / b;
            System.out.println("Деление " + a + " and " + b + " = " + res );
        }
    }

