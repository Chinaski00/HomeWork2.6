import java.util.*;

public class Main {
    public static void main(String[] args) {


        HashMap<String,String> map = new HashMap<>();
        map.put("Костя Чинаски", "+79921163063");
        map.put("Андрей Гарбуз", "+79529433948");
        map.put("Сергей Отерро", "+79921163342");
        map.put("Максим Польянов", "+79237323251");
        map.put("Дарья Черний", "+79921163063");
        map.put("Катя Черний", "+79921163063");
        map.put("Татьяна Иванова", "+79911163063");
        map.put("Евгений Иванов", "+79221163063");
        map.put("Анатолий Иванов", "+79321143063");
        map.put("Ваня Воржавин", "+79121123065");
        map.put("Илья Могутов", "+79151513011");
        map.put("Вова Комаров", "+79921163063");
        map.put("Сергей Комаров", "+79921163063");
        map.put("Ефим Годин", "+79921163063");
        map.put("Герман Греф", "+79921163063");
        map.put("Владимир Путин", "+79921163063");
        map.put("Саша Пушкин", "+79921163063");
        map.put("Лев Толстой", "+79921163063");
        map.put("Федор Достоевский", "+79921163063");
        map.put("Альберт Герт", "+79921163063");


        //Задача 3
        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("str1",1);
        map1.put("str2",2);
        map1.put("str3",3);
        map1.put("str4",4);

        //Задача 2.1
        Map<String, List<Integer>> map2 = new HashMap<>();
        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();
        List<Integer> integerList3 = new ArrayList<>();
        List<Integer> integerList4 = new ArrayList<>();
        List<Integer> integerList5 = new ArrayList<>();
        integerList.add(34);
        integerList.add(509);
        integerList.add(921);
        integerList2.add(111);
        integerList2.add(872);
        integerList2.add(31);
        integerList3.add(52);
        integerList3.add(423);
        integerList3.add(600);
        integerList4.add(22);
        integerList4.add(11);
        integerList4.add(33);
        integerList5.add(689);
        integerList5.add(723);
        integerList5.add(556);
        map2.put("str1",integerList);
        map2.put("str2",integerList2);
        map2.put("str3",integerList3);
        map2.put("str4",integerList4);
        map2.put("str5",integerList5);


        Map<Set<String>, Collection<List<Integer>>> map3 = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
        }
        int sum2 = 0;
        for (int i2 = 0; i2 < integerList2.size(); i2++) {
            sum += integerList2.get(i2);
        }
        int sum3 = 0;
        for (int i3 = 0; i3 < integerList3.size(); i3++) {
            sum += integerList3.get(i3);
        }
        int sum4 = 0;
        for (int i4 = 0; i4 < integerList4.size(); i4++) {
            sum += integerList4.get(i4);
        }
        int sum5 = 0;
        for (int i5 = 0; i5 < integerList5.size(); i5++) {
            sum += integerList5.get(i5);
        }
        integerList.clear();
        integerList.add(sum);
        integerList2.clear();
        integerList2.add(sum2);
        integerList3.clear();
        integerList3.add(sum3);
        integerList4.clear();
        integerList4.add(sum4);
        integerList5.clear();
        integerList5.add(sum5);
        map3.put(map2.keySet(), map2.values());
        System.out.println(map3.put(map2.keySet(), map2.values()));

        //Задача 2.2
        Map<Integer, String> map4 = new HashMap<>();
        map4.put(1,"str1");
        map4.put(2,"str2");
        map4.put(3,"str3");
        map4.put(4,"str4");
        map4.put(5,"str5");
        System.out.println(map4.keySet() + ":" + map4.values());
        for (Map.Entry<Integer, String> pair : map4.entrySet()) {
            System.out.println(String.format("Ключ: %s, Значение : %s", pair.getKey(), pair.getValue()));
        }


    }
    public static void addMap(String s, Integer integer){
        HashMap<String,Integer> map1 = new HashMap<>();
        if (map1.containsKey(s)){
            throw new RuntimeException("Такое значение уже есть");
        } if (map1.containsValue(integer)){
            map1.put(s,integer);
        }
    }
}