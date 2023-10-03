package com.training.org.entity;

import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)	
	private long courseid;
	
    @Column(name="coursename")
	private String name; 
     
    @ManyToMany(mappedBy = "courses", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private Set<Students> students;  

    public Course() {
	}

	public Course(String name) {
		this.name = name;
	}     

    public long getCourseid() {
		return courseid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
    
    
    public Set<Students> getStudents() {
        return students;
    }

    public void setStudents(Set<Students> students) {
        this.students = students;
    }	
}
