package com.natwest;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeCrud {

    JdbcTemplate jdbcTemplate;
    void createTable(){
        jdbcTemplate.execute("CREATE TABLE emp20 (id INT PRIMARY KEY, name VARCHAR(30), dept VARCHAR(30))");
    }
    void insertInto(){
        String sql = "INSERT INTO emp20 (id, name, dept) VALUES (2, 'Riti', 'HR')";
        jdbcTemplate.execute(sql);
    }
    void updateInToTable(){
        String sql = "INSERT INTO emp20 (id, name, dept) VALUES (?, ?, ?)";
        Object[] params = {1, "Riti", "HR"};

        jdbcTemplate.update(sql, params);
        System.out.println("Employee inserted successfully.");
    }
    void deleteFromTable() {
        String sql = "DELETE FROM emp20 WHERE id = 1";
        jdbcTemplate.execute(sql);
        System.out.println("Employee deleted successfully.");
    }
    void showTable(){
        String sql="SELECT * FROM emp20";
        jdbcTemplate.execute(sql);

    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
