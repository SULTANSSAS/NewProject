package com.pppp;

public class Employee {
    private int id;
    private String name;
    private double hrRate;

    public Employee(int id, String name, double hrRate) {
        this.id = id;
        this.name = name;
        this.hrRate = hrRate;
    }
    public double calculateSalary(){
        return 21*8*hrRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hrRate=" + hrRate +
                '}';
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

    public double getHrRate() {
        return hrRate;
    }

    public void setHrRate(double hrRate) {
        this.hrRate = hrRate;
    }

}
