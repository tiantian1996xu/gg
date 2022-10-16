package entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "employee_name")
    private String employee_name;

    @Column(name = "employee_salary")
    private String employee_salary;

    @Column(name = "employee_age")
    private String employee_age;

    @Column(name = "profile_image")
    private String profile_image;




    List<Employee>  employees;


}
