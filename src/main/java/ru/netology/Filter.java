package ru.netology;

import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {

        Logger logger = Logger.getInstance();

        logger.log("На вход фильтра поступил список из " + (source.size() + 1) + " элементов");
        logger.log("Выполняется фильтрация по значению: " + treshold);

        List<Integer> list = source.stream().filter(x -> x > treshold).toList();

        logger.log("В рузультате фильтрации осталось " + (list.size() + 1) + " элементов");

        return list;
    }
}
