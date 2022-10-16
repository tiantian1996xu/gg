package service;


@Service
public class EmployeeService {
    CommonResponse findById(String id);
    CommonResponse findname(String name);
    CommonResponse findsalary(String salary);
    CommonResponse findage(String age);
    CommonResponse findsalary(String salary);
    CommonResponse insert(employee emp);


    public CommonRespones getEmployeeByAge(int employee_age){
        Optional<Employee> studentOptional = studentRepository.findById(employee_Id);

    }
}
