package manager;
import model.Employee;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {

    private List<Employee> listEmployees;

    public EmployeeManager() {
        listEmployees = new ArrayList<>();
        loadInitialEmployees();
    }

    public void loadInitialEmployees()
    {
        listEmployees.add(new Employee(43212888,3000.0 ,"ENABLED",LocalDate.of(2019,4,25),"Julian Alvarez",11111));
        listEmployees.add(new Employee(44651182,2555.50 ,"ENABLED",LocalDate.of(2020,5,8),"Lautaro Martinez",12151));
        listEmployees.add(new Employee(30588112,2000.0 ,"ENABLED",LocalDate.of(2020,5,8),"Leandro Paredes",155501));
        listEmployees.add(new Employee(29998123,3050.0 ,"DISABLED",LocalDate.of(2019,5,8),"Rodrigo De Paul",211512));
        listEmployees.add(new Employee(38984991,2555.50 ,"ENABLED",LocalDate.of(2019,5,8),"Nahuel Molina",2551113));
    }


    //1)return list
    public List<Employee> getEmployeeList(){
        return listEmployees;
    }

    //2)Search for file
    public Employee findEmployeeByFile(int file){
        for(Employee e: listEmployees){
            if(e.getFile()==file)
                return e;
        }
        return null;
    }


    //3)Filter by salary range
    public List<Employee> filterSalaryByRange(double min, double max){
    return listEmployees.stream().filter(e->e.getSalary()>=min && e.getSalary()<=max).collect(Collectors.toList());
    }


    //4) Add salaries of qualified employees
    public double addSalaryEmployee(){
        double addition=0;
        for(Employee e: listEmployees){
            addition+=e.getSalary();
        }
        return addition;
    }

}
