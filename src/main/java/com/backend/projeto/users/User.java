package com.backend.projeto.users;


import jakarta.persistence.*;
import lombok.*;

@Entity(name="product")
@Table(name="product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String age;
    private String phone;
    private String cpf;


    public User(String name, String age, String phone, String cpf) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.cpf = cpf;
    }
}
