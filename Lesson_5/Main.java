package ru.geekbrains.lesson_java_5;

public class Main {

    public static void main(String[] args) {
	Employee[] emplArray = new Employee[5];
	emplArray[0] = new Employee("Ivanov Ivan", "Mechanical engineer",
            "iviv@mail.ru", "+81234567","1000$",30);
	emplArray[1] = new Employee("Kuzmin Kuzma", "Electrical engineer",
                "kuzkuz@mail.ru", "+81234568","1200$",45);
	emplArray[2] = new Employee("Petrov Petr", "Design engineer",
                "petpet@mail.ru", "+81234569","2000$",50);
	emplArray[3] = new Employee("Sidorova Maria", "Pneumatic engineer",
                "sidmar@mail.ru", "+81234570","1500$",26);
	emplArray[4] = new Employee("Egorov Egor", "Head of department",
                "egeg@mail.ru", "+81234571","3000",52);

	for (int i = 0; i < emplArray.length; i++) {
        emplArray[i].getAge();
    }
    }
}
