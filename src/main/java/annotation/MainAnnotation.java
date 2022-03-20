package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class MainAnnotation {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Employee employee = new Employee();
        employee.name = "a";
        Class aClass = employee.getClass();

        Field name = aClass.getDeclaredField("name");
        String firstName = null;
        Validation annotation = null;
            if (name.isAnnotationPresent(Validation.class)){
                 annotation = name.getAnnotation(Validation.class);
                firstName = (String) name.get(employee);
        }
            if (firstName.length() >= annotation.min() && firstName.length() <= annotation.max())
                System.out.println("Validation successfully");
            else throw new NotValidException("Field not valid length" + firstName.length());

    }
}
