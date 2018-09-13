import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.*;


/**
 * Created by Stepan Basov on 07.09.2018.
 */


public class zadanie5 {
    Scanner file;
    ArrayList list = new ArrayList();


    //Открываем файл, который находится в конре проекта
    public void openFile() {
        try {
            file = new Scanner(new File("Zadanie5.txt"));
        } catch (Exception e) {
            System.out.println("Файл не найден");
        }
    }

    //читаем файл
    public void readFile() {
        while (file.hasNext()) {
            String word = file.next();
            list.add(word);
        }
    }

    //Выводим слова в фале на экран
    public void outFile() {
        System.out.println("В файле есть слова: " + list);

    }

    //Выполняем условия задания
    public void getZadanie() {
        Set<String> sortedSet = new TreeSet<String>();
        Map<String, Integer> statistic = new HashMap<String, Integer>();
        // Преобразуем массив для сортировки записей.
        int nul = 0;
        String peremennay;
        String max[];
        max = new String[1];

//Используем цикл по проходу по коллекции, не стал применять forEach
        for (int i = 0; i < list.size(); i++) {
            peremennay = (String) list.get(i);
            sortedSet.add(peremennay);
// Сразу делаем подсчет слов из файла и записыаем их
            Integer count = statistic.get(peremennay);
            if (count == null) {
                count = 0;
            }
            //Запись
            statistic.put(peremennay, ++count);

            //Находим слово с максимальным повторением
            if (count > nul) {
                nul = count;
                max[0] = peremennay;

            }

        }

        System.out.println("Сортировка: " + sortedSet);
        System.out.println("Подсчет слов: " + statistic);
        System.out.println("Наибольшее: " + max[0] + " Колличество повторений = " + nul);


    }


}
