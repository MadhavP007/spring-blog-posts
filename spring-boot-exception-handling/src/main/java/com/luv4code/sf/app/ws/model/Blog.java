package com.luv4code.sf.app.ws.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blogs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    @Id
    private int blogId;
    private String blogTitle;
    private String blogCreator;
    private int yearOfPost;
}