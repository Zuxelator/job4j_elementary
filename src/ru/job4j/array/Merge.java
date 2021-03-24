package ru.job4j.array;
//Даны два отсортированных по возрастанию массива. Как без сортировки их объединить в третий массив?
public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int value;
        int counter = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        int resIndex = 0;

        int[] rsl = new int[left.length + right.length];

        // проверка на нулевые массивы
        if (left.length == 0) {
            for (int i = 0; i < right.length; i++) {
                rsl[i] = right[i];
            }
        }
        if (right.length == 0) {
            for (int i = 0; i < left.length; i++) {
                rsl[i] = left[i];
            }
        }

        while ((left.length > leftIndex) && (right.length > rightIndex)) {

            //ищем минимальное значение из крайних двух ячеек обоих массивов
            value = Math.min(left[leftIndex], right[rightIndex]);

            //считаем сколько таких же значений есть еще в обоих массивах
            for (int item : left) {
                if (item == value) {
                    counter++;
                    leftIndex++;
                }
            }

            for (int item : right) {
                if (item == value) {
                    counter++;
                    rightIndex++;
                }
            }

            //записываем эти значения в итоговый массив
            while (counter > 0) {
                rsl[resIndex] = value;
                resIndex++;
                counter--;
            }

        }
        //тут один из массивов уже полностью проверен, остается определить какой из массивов остался и переписать оставшиеся значения в результирующий массив
        if (leftIndex < rightIndex) {
            for (int i = leftIndex; i < left.length; i++) {
                rsl[resIndex] = left[leftIndex];
                leftIndex++;
                resIndex++;
            }

        }

        if (leftIndex > rightIndex) {
            for (int i = rightIndex; i < right.length; i++) {
                rsl[resIndex] = right[rightIndex];
                rightIndex++;
                resIndex++;
            }
        }
        return rsl;
    }
}