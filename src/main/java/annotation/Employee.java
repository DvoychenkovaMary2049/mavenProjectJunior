package annotation;
@MyAnnotation("Employee info")
public class Employee {

    @Validation
    String name;

    public void info(String name){
        System.out.println("Info");
    }
}
