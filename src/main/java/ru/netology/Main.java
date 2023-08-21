package ru.netology;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Запуск программы");

        logger.log("Просим ввести размер списка для создания ");
        System.out.println("Введите размер списка: ");
        int size = scanner.nextInt();
        logger.log("Пользователь ввел размер равный " + size);

        logger.log("Просим ввести порог значения элемента списка");
        System.out.println("Введите порог значений для списка:");
        int maxValue = scanner.nextInt();

        logger.log("Пользователь ввел порог значения элемента списка равный " + maxValue);

        logger.log("Генерируем список из случайных чисел с заданными параметрами ");
        List<Integer> generatedList = getNewFilledList(size, maxValue);
        System.out.println("Сгенерированый список из случайных чисел: " + generatedList);

        logger.log("Список сгенерирован " + generatedList);

        logger.log("Просим задать значение фильтрации ");
        System.out.println("Введите значений для фильрации списка: ");
        int filteValue = scanner.nextInt();

        logger.log("Пользователь ввел значение для фильтрации " + filteValue);

        logger.log("Выполняем фильтрацию по заданным параметрам ");
        Filter filter = new Filter(filteValue);
        List<Integer> filtredList = filter.filterOut(generatedList);

        logger.log("Результат фильтрации " + filtredList);

        System.out.println("Отфильрованный список: " + filtredList);

        logger.log("Завешаем работу программы");
    }

    private static List<Integer> getNewFilledList(int size, int maxValue) {

        List<Integer> list = new ArrayList<>(size);
        Random random = new Random();
        maxValue = maxValue + 1;

        for (int i = 1; i < size; i++) {
            list.add(random.nextInt(maxValue));
        }
        return list;
    }
}