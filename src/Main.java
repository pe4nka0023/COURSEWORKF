public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Ivanov Kirill Victorovich", 1, 20000);
        employees[1] = new Employee("Nicolaev Oleg Igorevich", 2, 35000);
        employees[2] = new Employee("Ivanov Albert Nikitich", 3, 40000);
        employees[3] = new Employee("Durov Pavel Ivanovich", 4, 25000);
        employees[4] = new Employee("Palagushina Inna Victorovna", 5, 28000);
        employees[5] = new Employee("Ivansova Polina Maksimovna", 6, 36000);
        employees[6] = new Employee("Zolotorev Kirill Nikitich", 7, 34000);
        employees[7] = new Employee("Krasnov Ilia Ruslanovicg", 8, 27000);
        employees[8] = new Employee("Ivanova Kristina Andreevna", 9, 28000);
        employees[9] = new Employee("Lebedev Aleksandr Anatolevich", 10, 25000);


        printAll();
        System.out.println(getSalarySum());
        System.out.println(getEmployeeWithMinSalary());
        System.out.println(getEmployeeWithMaxSalary());
        System.out.println(getAverageSalary());
        printAllNames();
    }


    private static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static double getSalarySum() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();

        }
        return sum;
    }

    private static Employee getEmployeeWithMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }

        }
        return min;
    }

    private static Employee getEmployeeWithMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }

        }
        return max;

    }
    private static double getAverageSalary(){
        return getSalarySum() / employees.length;
    }

    private static void printAllNames(){
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
            
        }
    }
}