package Coursework1;

public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        book.addEmployee("Иванов Иван Иванович", 1, 20_500);
        book.addEmployee("Петров Петр Петрович", 3, 32_450);
        book.addEmployee("Сидоров Константин Викторович", 1, 47_384);
        book.addEmployee("Софронова Ольга Сергеевна", 2, 28_394);
        book.addEmployee("Афанасьева Екатерина Олеговна", 4, 56_485);
    }
}