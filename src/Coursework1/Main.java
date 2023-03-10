package Coursework1;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void printEmployeeList () {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                System.out.println(employee.toString());
            } else {
                break;
            }
        }
    }
    public static double sumSalaryPerMonth () {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                sum = sum + employee.getSalary();
            } else {
                break;
            }
        }
        return sum;
        }
        public static Employee findEmployeeWithMinSalary () {
            double min = Double.MAX_VALUE;
            Employee employeeWithMinSalary = null;
            for (int i = 0; i < employees.length;i++) {
                Employee employee = employees[i];
                if (employee != null && employee.getSalary() < min) {
                    min = employee.getSalary();
                    employeeWithMinSalary = employee;
                } else if (employee == null) {
                    break;
                }
            }
            return employeeWithMinSalary;
        }
    public static Employee findEmployeeWithMaxSalary () {
        double max = Double.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (int i = 0; i < employees.length;i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeWithMaxSalary = employee;
            } else if (employee == null) {
                break;
            }
        }
        return employeeWithMaxSalary;
    }
    public static double findMedianSalary () {
        return sumSalaryPerMonth()/Employee.counter;
    }
    public static void printAllEmployeeNames () {
        for (int i = 0; i < employees.length; i++) {
                Employee employee = employees[i];
                if (employee != null) {
                    System.out.println(employee.getName());
                } else {
                    break;
                }
        }
    }
    public static void indexSalary (int percent) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                double indexedSalary = employee.getSalary() + (employee.getSalary() * percent / 100);
                employee.setSalary(indexedSalary);
            } else {
                break;
            }
        }
    }
    public static Employee findEmployeeWithMinSalaryPerDep (int department) {
        double min = Double.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (int i = 0; i < employees.length;i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getDepartment() == department && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeWithMinSalary = employee;
            } else if (employee == null) {
                break;
            }
        }
        return employeeWithMinSalary;
    }
    public static Employee findEmployeeWithMaxSalaryPerDep (int department) {
        double max = Double.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (int i = 0; i < employees.length;i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeWithMaxSalary = employee;
            } else if (employee == null) {
                break;
            }
        }
        return employeeWithMaxSalary;
    }
    public static double sumSalaryPerMonthPerDep (int department) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getDepartment() == department) {
                sum = sum + employee.getSalary();
            } else if (employee == null) {
                break;
            }
        }
        return sum;
    }
    public static double findMedianSalaryPerDep (int department) {
        int numberOfEmployees = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getDepartment() == department) {
                numberOfEmployees++;
            } else if (employee == null) {
                break;
            }
        }
        return sumSalaryPerMonthPerDep(department)/numberOfEmployees;
    }
    public static void indexSalaryPerDep (int department, int percent) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getDepartment() == department) {
                double indexedSalary = employee.getSalary() + (employee.getSalary() * percent / 100);
                employee.setSalary(indexedSalary);
            } else if (employee == null) {
                break;
            }
        }
    }
    public static void printAllEmployeesPerDep (int department) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.getId() + ". Ф.И.О.: " + employee.getName() + ".\n" + "Зарплата: " + employee.getSalary() + ".");
            } else if (employee == null) {
                break;
            }
        }
    }
    public static void findEmployeesWithSalaryLessThan (double salary) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() < salary) {
                System.out.println(employee.getId() + ". Ф.И.О.: " + employee.getName() + ".\n" + "Зарплата: " + employee.getSalary() + ".");
            } else if (employee == null) {
                break;
            }
        }
    }
    public static void findEmployeesWithSalaryMoreThan (double salary) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println(employee.getId() + ". Ф.И.О.: " + employee.getName() + ".\n" + "Зарплата: " + employee.getSalary() + ".");
            } else if (employee == null) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", 4, 45673);
        Employee employee2 = new Employee("Петров Петр Петрович", 1, 53985);
        Employee employee3 = new Employee("Петров Петр Иванович", 1, 51954);
        employees [0] = employee1;
        employees [1] = employee2;
        employees [2] = employee3;
        /*
         printEmployeeList();
         System.out.println("sumSalaryPerMonth() = " + sumSalaryPerMonth());
         System.out.println("findEmployeeWithMaxSalary() = " + findEmployeeWithMaxSalary());
         System.out.println(findMedianSalary());
         printAllEmployeeNames();
         indexSalary(5);
         System.out.println(employees[1].getSalary());
         System.out.println("findEmployeeWithMinSalaryPerDep(1) = " + findEmployeeWithMinSalaryPerDep(1));
         System.out.println("findEmployeeWithMaxSalaryPerDep(1) = " + findEmployeeWithMaxSalaryPerDep(1));
         System.out.println(sumSalaryPerMonthPerDep(1));
         System.out.println(findMedianSalaryPerDep(1));
        indexSalaryPerDep(1,5);
        System.out.println(employee2);
        printAllEmployeesPerDep(1);
         */
        findEmployeesWithSalaryMoreThan(50000);
    }
}