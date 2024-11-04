package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        int num = 1;
        while (num <= numberOfDishes) {
            queue.add(num);
            num++;
        }

        while (!queue.isEmpty()) {
            for (int i = 1; i < everyDishNumberToEat; i++) {
                queue.add(queue.poll());
            }
            result.add(queue.poll());
        }

        return result;
    }
}
