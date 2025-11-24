package lk.zerocode.gitpractical.controller.request;

public class EmployeeAddRequest {
    String firstName;
    String lastName;
    String email;
    double salary;
    String getFirstName() {
        return firstName;
    }
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    String getLastName() {
        return lastName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
    String getEmail() {
        return email;
    }
    void setEmail(String email) {
        this.email = email;
    }
    double getSalary() {
        return salary;
    }
    void setSalary(double salary) {
        this.salary = salary;
    }

}
