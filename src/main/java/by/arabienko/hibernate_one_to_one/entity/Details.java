package by.arabienko.hibernate_one_to_one.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "details")
public class Details {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

    @Column(name = "city")
    private String city;

    @Column(name ="phone_number")
    private String phone_number;

    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "details",
    cascade = {CascadeType.PERSIST,CascadeType.REFRESH})
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Details() {
    }

    public Details(String city, String phone_number, String email) {
        this.city = city;
        this.phone_number = phone_number;
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
