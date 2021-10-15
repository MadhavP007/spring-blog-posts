package com.luv4code.sf.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "blog")
@Data
@NoArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Size(min = 2, message = "Blog Title must have at least 2 characters")
    private String blogTitle;
    @NotBlank(message = "Blog Editor cannot be blank")
    private String blogEditor;
    @Email(message = "Email should be valid")
    private String blogEmail;

    public Blog(long id,
                @NotNull(message = "Blog Title must have at least 2 characters") String blogTitle,
                @NotBlank(message = "Blog Editor cannot be blank") String blogEditor,
                @Email(message = "Email should be valid") String blogEmail) {
        this.id = id;
        this.blogTitle = blogTitle;
        this.blogEditor = blogEditor;
        this.blogEmail = blogEmail;
    }
}
