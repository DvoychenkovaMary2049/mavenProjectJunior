package generics;

public class ParametrizeMetod {
    public static void main(String[] args) {
        Method method = new Method();

        method.print(43.6);
    }
}

class Method {

    public <T> T print(T t){
        System.out.println(t);
        return t;
    }

}
