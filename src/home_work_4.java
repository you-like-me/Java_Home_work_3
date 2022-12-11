import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class home_work_4 {
    public static void main(String[] args) {

//1.Создать словарь HashMap. Обобщение <Integer, String>.

        Map<Integer, String> map = new HashMap<>();

//2.Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)

        map.putIfAbsent(4, "синий");
        map.putIfAbsent(6, "красный");
        map.putIfAbsent(1, "зеленый");
        System.out.println(map);

//3.Изменить значения дописав восклицательные знаки.

        Set<Integer> keySet = map.keySet();
        for (int i: keySet) {
            map.compute(i, (k, v) -> v = v + "!");
        }
        System.out.println("++++++");
        System.out.println(map);

//4.*Создать TreeMap, заполнить аналогично.

        Map<Integer, String> tMap = new TreeMap<>();

        tMap.putIfAbsent(1, "ромашка");
        tMap.putIfAbsent(2, "маргаритка");
        tMap.putIfAbsent(19, "роза");
        tMap.putIfAbsent(65, "фикус");
        tMap.putIfAbsent(8, "кактус");
        tMap.putIfAbsent(15, "тюльпан");
        System.out.println("_____________");
        System.out.println(tMap);

//5.*Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.

        Map<Integer, String> mapa = new HashMap<>();

        for (int i = 0; i < 1001; i++) {
            mapa.put(i, "ромашка");
        }
        System.out.println(mapa);
    }

}
