package lesson22;

public class Main4 {
    public static void main(String[] args) {
        try {
            // Десериализация
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.FileInputStream("state.bin"));
            System.out.println("Double: " + ois.readDouble());
            System.out.println("String: " + ois.readObject().toString());
            System.out.println("Point: " + (Point) ois.readObject());
            ois.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
