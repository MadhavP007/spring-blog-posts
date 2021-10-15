package com.luv4code.sf.app.ui.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "blog")
@NamedStoredProcedureQuery(name = "getAllBlogs", procedureName = "getAllBlogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long blogId;
    @Column
    private String title;
    @Column
    private Integer yearOfPost;
}