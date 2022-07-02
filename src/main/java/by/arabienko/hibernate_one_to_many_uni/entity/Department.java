package by.arabienko.hibernate_one_to_many_uni.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "min_salary")
    private int minSalary;

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void addEmployeeToDepartment(Employees employees) {
        if (employeesList==null) {
            employeesList = new ArrayList<>();
        }
        employeesList.add(employees);
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private List<Employees> employeesList;

    public Department() {
    }

    public Department(int maxSalary, int minSalary, String name) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +
                '}';
    }
}