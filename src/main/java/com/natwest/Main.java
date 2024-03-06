package com.natwest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
        EmployeeCrud employeeCrud=(EmployeeCrud) applicationContext.getBean("employeeCrud");
//        employeeCrud.createTable();
//        employeeCrud.insertInToTable();
//        employeeCrud.updateInToTable();
//        employeeCrud.deleteFromTable();
//        employeeCrud.showTable();

    }
}