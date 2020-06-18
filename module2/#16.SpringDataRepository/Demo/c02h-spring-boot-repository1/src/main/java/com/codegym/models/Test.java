package com.codegym.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Test {

    @Id
    Date date;
}
