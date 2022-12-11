import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class home_work_3 {
    public static void main(String[] args) {

//1.Создать новый список, добавить несколько строк и вывести коллекцию на экран.

        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr1.add(new Random().nextInt(10));
        }
        System.out.println(arr1);

//2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.

        ArrayList<String> colors = new ArrayList<>();
        colors.add("красный");
        colors.add("синий");
        colors.add("желтый");
        colors.add("зеленый");
        colors.add("серый");
        colors.add("коричневый");

        System.out.println(colors);

        Iterator<String> iterator = colors.iterator();

        while(iterator.hasNext()){
            String i = iterator.next();
            i += "!";
            System.out.printf(i + ", ");
        }
        System.out.println();

//3.Вставить элемент в список в первой позиции.

        colors.add(0, "оранжевый");
        System.out.println(colors);

//4.Извлечь элемент (по указанному индексу) из заданного списка.

        System.out.println(colors.get(4));

//5.Обновить определенный элемент списка по заданному индексу.

        colors.set(5, "фиолетовый");
        System.out.println(colors);

//6.Удалить третий элемент из списка.

        colors.remove(3);
        System.out.println(colors);

//7.Поиска элемента в списке по строке.

        int n = colors.indexOf("красный");
        System.out.println(n);

//8.Создать новый список и добавить в него несколько елементов первого списка.

        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr2.add(new Random().nextInt(10));
        }
        System.out.println(arr2);

//9.Удалить из первого списка все элементы отсутствующие во втором списке.

        arr2.retainAll(arr1);
        System.out.println(arr1);
        System.out.println("________");
        System.out.println(arr2);

//10.*Сортировка списка.

        System.out.println("++++++++++");
        System.out.println(arr2);
        arr2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(arr2);

    }
}
