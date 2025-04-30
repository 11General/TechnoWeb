package techno.web.studentmanager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "students")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String username;
    private String pole;
    private String email;
    private String password;
    private String phone;
    @Column(nullable = false, updatable = false)
    private String studentCode;

    public Student() {}

    public Student(String studentCode, String username, String email, String pole, String password, String phone) {
        this.studentCode = studentCode;
        this.username = username;
        this.email = email;
        this.pole = pole;
        this.password = password;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPole() {
        return pole;
    }

    public void setPole(String pole) {
        this.pole = pole;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pole='" + pole + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", studentCode='" + studentCode + '\'' +
                '}';
    }
}
