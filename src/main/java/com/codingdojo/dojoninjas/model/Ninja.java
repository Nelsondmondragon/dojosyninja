package com.codingdojo.dojoninjas.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@RequiredArgsConstructor
@Table(name = "ninjas")
@Entity
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "First Name not null.")
    @NotEmpty(message = "First Name is required.")
//    @Size(min = 1, message = "First Name is required.")
    private String firstName;

    @NotNull
    @Size(min = 1, message = "LastName is required.")
    private String lastName;

    @NotNull(message = "Age is required.")
    private Integer age;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    @Column(name = "dojos_id")
    private Long dojosId;

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "dojos_id", updatable = false, insertable = false)
    private Dojo dojo;
}
