package Coursework1;

public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        book.addEmployee("fhhf", 1, 666);
        book.addEmployee("вррао", 3, 555);
        book.addEmployee("hdhfg", 1, 444);
        book.addEmployee("hg", 2, 333);
        book.addEmployee("hgu", 4, 667);
        book.removeEmployee(4);
        book.printEmployeeList();
    }
}