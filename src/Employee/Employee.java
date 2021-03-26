package Employee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    private String id;
    private String name;
    private String lastname;
    private int age;
    private String email;

    public Employee(String id,String name, String lastname,int age,String email){
        this.id=id;
        this.name=name;
        this.lastname=lastname;
        this.setEmail(email);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 1 || age >= 100) {
            age = 1;
            System.out.println("WARNING: El valor enviado no se encuentra dentro de los rangos establecidos [1,99] por lo tanto el valor fue set con 1");

        }
        this.age = age;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(email);
        if (mat.find()) {
            System.out.println("CORREO VALIDO:");
        } else {
            System.out.println("CORREO NO VALIDO:");
        }
        this.email = email;
    }
}