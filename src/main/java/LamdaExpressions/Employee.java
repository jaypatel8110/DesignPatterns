package LamdaExpressions;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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

//        Test t= new Test();
//        EmpUtil empobj=(age,name)-> new Employee(age,name);
//
//         System.out.println("Proved this can be called directly "  +  empobj.appendname(20,"Patel"));
//
//         Employee e= (Employee) empobj.appendname(20,"Patel");
//
//        System.out.println("Printing name "  + e.getName());
//
//
//        t.nameTest((Employee) empobj.appendname(20,"jay"));

        
        List<Employee> employeeList = null;
       // List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee(27,"Prerna"));
//        employeeList.add(new Employee(27,"Jay"));
//        employeeList.add(new Employee(27,"Prerna Jay"));

        if (employListNotNullAndNotEmpty(employeeList)){
            System.out.println("In the looop");
        }else {
            System.out.println("In the ELSE looop");
        }

    }

    public static boolean employListNotNullAndNotEmpty(List<Employee> employeeList) {
        return Optional.ofNullable(employeeList)
                .stream().count()>0
                ;
    }
}
