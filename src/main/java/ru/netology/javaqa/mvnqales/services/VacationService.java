package ru.netology.javaqa.mvnqales.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                if (money >= threshold) {
                    money = money - (money / 3);
                }
            } else {
                money = money + income;
            }
        }
        return count;
    }
}
