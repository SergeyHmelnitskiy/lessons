package lesson4;

public class lesson4 {
    public static void main(String[] args) {
        Employee employee= new Employee("Иванов Иван Иванович", "инженер", "ivan@gmail.com",
                "+375296543252", 40000, 35);
        employee.getEmployeeInfo(); // проверка 1-го задания
        Employee[] employeesArray = new Employee[5]; // массив для 2-го задания
        employeesArray[0] = new Employee("Иванов Иван Иванович", "инженер", "ivan@gmail.com",
                "+375296543252", 40000, 35);
        employeesArray[1] = new Employee("Сергеев Сергей Сергеевич", "инженер-прог", "serg@gmail.com",
                "+375296543001", 50000, 36);
        employeesArray[2] = new Employee("Подольская Екатерина Ивановна", "тестер", "kate@gmail.com",
                "+375296544001", 35000, 28);
        employeesArray[3] = new Employee("Петров Петр Петрович", "инженер", "petr@gmail.com",
                "+375296552234", 25000, 26);
        employeesArray[4] = new Employee("Губин Василий Иванович", "CEO", "vasiliy@gmail.com",
                "+375296654458", 70000, 37);
        for (Employee employees : employeesArray) {
            employees.getEmployeeInfo();
        }
        // поверка 3-го задания
        Park park = new Park("Парк Горького", "Минск", "09:00-21:00", 3);
        park.addAttraction(0, "Супер-8", "09:00-21:00", 10);
        park.addAttraction(1, "Горка", "09:00-21:00", 15);
        park.addAttraction(2, "Карусели", "09:00-21:00", 12);
        // вывод 3-го задания
        park.printPark();
        park.printAttractions();
    }
}
