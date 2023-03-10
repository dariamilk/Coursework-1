package Coursework1;

public class Employee {
    private String name;
    private int department;
    private double salary;
    private int id;
    static int counter = 0;
    public  Employee (String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        counter++;
        id = counter;


    }
    public String getName () {
        return name;
    }
    public int getDepartment () {
        return department;
    }
    public double getSalary () {
        return salary;
    }
    public int getId () {
        return id;
    }
    public int getCounter () {
        return counter;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setDepartment (int department) {
        this.department = department;
    }
    public void setSalary (double salary) {
        this.salary = salary;
    }
    @Override
    public String toString () {
        return id + ". Ф.И.О.: " + name + ".\n" + "Отдел: " + department + ".\n" + "Зарплата: " + salary + ".";
    }
}
