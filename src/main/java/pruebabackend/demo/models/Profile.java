package pruebabackend.demo.models;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="profiles")
public class Profile {
    @OneToOne
    private User user;
    private String name;
    private String lastname;
    private String experience;
    @ManyToMany
    private List <Course> courses;



    public Profile() {
    }



    public Profile(User user, String name, String lastname, String experience, List<Course> courses) {
        this.user = user;
        this.name = name;
        this.lastname = lastname;
        this.experience = experience;
        this.courses = courses;
    }



    public User getUser() {
        return user;
    }



    public void setUser(User user) {
        this.user = user;
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



    public String getExperience() {
        return experience;
    }



    public void setExperience(String experience) {
        this.experience = experience;
    }



    public List<Course> getCourses() {
        return courses;
    }



    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    

    

    
}


