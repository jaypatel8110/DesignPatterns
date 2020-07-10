package LamdaExpressions;

import java.util.Comparator;

public class Employee {

    int age;
    String name;

    public Employee(int i, String name) {
        this.age=i;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

@FunctionalInterface
interface EmpUtil<T>{
    T appendname(int age,String name);
}


class Test{

    public void nameTest(Employee employee){
        System.out.println(employee.getAge() + "  "+ employee.getName());

    }

    public static void main(String[] args) {

        Test t= new Test();


        EmpUtil empobj=(age,name)-> new Employee(age,name);

         System.out.println("Proved this can be called directly "  +  empobj.appendname(20,"Patel"));

         Employee e= (Employee) empobj.appendname(20,"Patel");

        System.out.println("Printing name "  + e.getName());


         t.nameTest((Employee) empobj.appendname(20,"jay"));

    }
}
