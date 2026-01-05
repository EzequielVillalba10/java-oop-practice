package model;

import java.time.LocalDate;

public class Employee {
    private int id;
    private int file;
    private String name;
    private LocalDate entryDate;
    private double salary;
    private String state;


    public Employee(int id, double salary, String state, LocalDate entryDate, String name, int file) {
        this.id = id;
        this.salary = salary;
        this.state = state;
        this.entryDate = entryDate;
        this.name = name;
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Employee{"  +
                " File=" + file +
                "- Name='" + name  +
                "- entryDate=" + entryDate +
                '}';
    }
}
