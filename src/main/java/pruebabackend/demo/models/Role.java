package pruebabackend.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="roles")
public class Role {
    private String roleName;
}
