package generics;

    import java.util.ArrayList;

    public class PerametrizeClass {
        public static void main(String[] args) {
            Print <String> print = new Print<String>("Text text", "ssss");
            print.printInfo();
        }
    }


    class Print <K>{
        K value;
        K value1;

        public Print(K value, K va ) {
            this.value = value;
            this.value1 = va;
        }

        public void printInfo(){
            System.out.println(value);
            System.out.println(value1);

        }

        public void printFirstElement(ArrayList<K> arrayList){
            for ( K el : arrayList) System.out.println(el);{

            }
        }
    }


