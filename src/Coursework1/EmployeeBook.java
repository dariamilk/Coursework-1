package Coursework1;

public class EmployeeBook {
    private final Employee[] employees;
    public EmployeeBook () {
        employees = new Employee[10];
    }
    public void addEmployee (String name, int department, double salary) {
        if (Employee.counter >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        } else {
            Employee employee = new Employee(name, department, salary);
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = employee;
                    break;
                }
            }
        }
    }
    public void removeEmployee (String name) {
        for (int i = 0; i < Employee.counter; i++) {
            if (employees[i].getName().equals(name)) {
                System.out.println(employees[i].getName() + " удален.");
                System.arraycopy(employees, i + 1, employees, i, Employee.counter - i - 1);
                employees[Employee.counter - 1] = null;
                Employee.counter--;
                for ( int j = i; j < Employee.counter; j++) {
                    employees[j].setId(j+1);
                }
            }
        }
    }
    public void removeEmployee (int id) {
        for (int i = 0; i < Employee.counter; i++) {
            if (employees[i].getId()==id) {
                System.out.println(employees[i].getName() + " удален.");
                System.arraycopy(employees, i + 1, employees, i, Employee.counter - i - 1);
                employees[Employee.counter - 1] = null;
                Employee.counter--;
                for ( int j = i; j < Employee.counter; j++) {
                    employees[j].setId(j+1);
                }
            }
        }
    }
    public void editEmployeeSalary (String name, double salary) {
        for (int i = 0; i < Employee.counter; i++) {
            if (employees[i].getName().equals(name)) {
                employees[i].setSalary(salary);
            }
        }
    }
    public void editEmployeeDepartment (String name, int department) {
        for (int i = 0; i < Employee.counter; i++) {
            if (employees[i].getName().equals(name)) {
                employees[i].setDepartment(department);
            }
        }
    }
    public void printEmployeesPerDep () {
        for (int j = 1; j < 5; j++) {
            System.out.println("Отдел: " + j + " .");
            for (int i = 0; i < Employee.counter; i++) {
                if (employees[i].getDepartment() == j) {
                    System.out.println(employees[i].getId() + ". Ф.И.О.: " + employees[i].getName() + ". " + "Зарплата: " + employees[i].getSalary() + ".");
                }
            }
        }
    }
    public void printEmployeeList () {
        for (int i = 0; i < Employee.counter; i++) {
            System.out.println(employees[i].toString());
        }
    }
    public double sumSalaryPerMonth () {
        double sum = 0;
        for (int i = 0; i < Employee.counter; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }
    public Employee findEmployeeWithMinSalary () {
        double min = Double.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (int i = 0; i < Employee.counter; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }
    public Employee findEmployeeWithMaxSalary () {
        double max = Double.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (int i = 0; i < Employee.counter;i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }
    public double findMedianSalary () {
        return sumSalaryPerMonth()/Employee.counter;
    }
    public void printAllEmployeeNames () {
        for (int i = 0; i < Employee.counter; i++) {
            System.out.println(employees[i].getName());
        }
    }
    public void indexSalary (int percent) {
        for (int i = 0; i < Employee.counter; i++) {
            double indexedSalary = employees[i].getSalary() + (employees[i].getSalary() * percent / 100);
            employees[i].setSalary(indexedSalary);
        }
    }
    public Employee findEmployeeWithMinSalaryPerDep (int department) {
        double min = Double.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (int i = 0; i < Employee.counter;i++) {
            if (employees[i].getDepartment() == department && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }
    public Employee findEmployeeWithMaxSalaryPerDep (int department) {
        double max = Double.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (int i = 0; i < Employee.counter;i++) {
            if (employees[i].getDepartment() == department && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }
    public double sumSalaryPerMonthPerDep (int department) {
        double sum = 0;
        for (int i = 0; i < Employee.counter; i++) {
            if (employees[i].getDepartment() == department) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }
    public double findMedianSalaryPerDep (int department) {
        int numberOfEmployees = 0;
        for (int i = 0; i < Employee.counter; i++) {
            if (employees[i].getDepartment() == department) {
                numberOfEmployees++;
            }
        }
        return sumSalaryPerMonthPerDep(department)/numberOfEmployees;
    }
    public void indexSalaryPerDep (int department, int percent) {
        for (int i = 0; i < Employee.counter; i++) {
            if (employees[i].getDepartment() == department) {
                double indexedSalary = employees[i].getSalary() + (employees[i].getSalary() * percent / 100);
                employees[i].setSalary(indexedSalary);
            }
        }
    }
    public void printAllEmployeesPerDep (int department) {
        for (int i = 0; i < Employee.counter; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].getId() + ". Ф.И.О.: " + employees[i].getName() + ".\n" + "Зарплата: " + employees[i].getSalary() + ".");
            }
        }
    }
    public void findEmployeesWithSalaryLessThan (double salary) {
        for (int i = 0; i < Employee.counter; i++) {
            if (employees[i].getSalary() < salary) {
                System.out.println(employees[i].getId() + ". Ф.И.О.: " + employees[i].getName() + ".\n" + "Зарплата: " + employees[i].getSalary() + ".");
            }
        }
    }
    public void findEmployeesWithSalaryMoreThan (double salary) {
        for (int i = 0; i < Employee.counter; i++) {
            if (employees[i].getSalary() >= salary) {
                System.out.println(employees[i].getId() + ". Ф.И.О.: " + employees[i].getName() + ".\n" + "Зарплата: " + employees[i].getSalary() + ".");
            }
        }
    }
}
