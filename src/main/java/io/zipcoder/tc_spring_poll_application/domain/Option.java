package io.zipcoder.tc_spring_poll_application.domain;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
//@EnableAutoConfiguration
public class Option {
  @Id
  @GeneratedValue
  @Column(name = "OPTION_ID")

    private Long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
