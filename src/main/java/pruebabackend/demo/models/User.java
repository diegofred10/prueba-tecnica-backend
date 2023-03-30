package pruebabackend.demo.models;



import org.springframework.context.annotation.Profile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
    public class User {
        @Id@Column(name="userName")
        private String password;
        @OneToOne
        private Profile profile;
        @ManyToMany
        private Role role;

        

        public User() {
        }



        public User(String password, Profile profile, Role role) {
            this.password = password;
            this.profile = profile;
            this.role = role;
        }



        public String getPassword() {
            return password;
        }



        public void setPassword(String password) {
            this.password = password;
        }



        public Profile getProfile() {
            return profile;
        }



        public void setProfile(Profile profile) {
            this.profile = profile;
        }



        public Role getRole() {
            return role;
        }



        public void setRole(Role role) {
            this.role = role;
        }


        
    }   
    
    
    
    
    
    
       