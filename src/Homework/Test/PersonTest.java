package Homework.Test;

import Homework.Context.AgeContext;
import Homework.Context.Context;
import Homework.Context.NameContext;
import Homework.Context.SexContext;
import Homework.Exception.NotValidSexException;
import Homework.Object.Person;
import Homework.Object.Sex;
import Homework.Sorting.BubbleSort;
import Homework.Sorting.GnomeSort;
import Homework.Sorting.AbstractSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Задание 3. Дан массив объектов Person. Класс Person характеризуется полями age (возраст, целое число 0-100),
 * sex (пол – объект класса Sex со строковыми константами внутри MAN, WOMAN), name (имя - строка).
 * Создать два класса, методы которых будут реализовывать сортировку объектов. Предусмотреть единый интерфейс для
 * классов сортировки. Реализовать два различных метода сортировки этого массива по правилам:
 * - первые идут мужчины
 * - выше в списке тот, кто более старший
 * - имена сортируются по алфавиту
 * <p>
 * - Программа должна вывести на экран отсортированный список и время работы каждого алгоритма сортировки.
 * - Предусмотреть генерацию исходного массива (10000 элементов и более).
 * - Если имена людей и возраст совпадают, выбрасывать в программе пользовательское исключение.
 */
public class PersonTest {
    final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    final java.util.Random rand = new java.util.Random();

    final Set<String> identifiers = new HashSet<>();

    public String randomIdentifier() {
        StringBuilder builder = new StringBuilder();
        while (builder.toString().length() == 0) {
            int length = rand.nextInt(5) + 5;
            for (int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if (identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }

    private List<Person> getData() throws NotValidSexException {
        List<Person> list = new ArrayList<>();
        Sex man = new Sex(Sex.MAN);
        Sex woman = new Sex(Sex.WOMAN);
        for (int i = 0; i < 1000; i++) {
            list.add(new Person(this.randomIdentifier(), rand.nextInt(100), rand.nextBoolean() ? man : woman));
        }
        return list;
    }

    private void printData(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    private void sortData(AbstractSort<Person> sort, Context<Person> context) {
        try {
            List<Person> data = this.getData();
            long start = System.currentTimeMillis();
            data = sort.sort(data, context);
            System.out.println("---" + sort + "(" + context + ")--- Time: " + (System.currentTimeMillis() - start + "ms"));
            this.printData(data);
            Assert.assertTrue(sort.isSorted(data, context));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void bubbleSortSexContextTest() {
        this.sortData(new BubbleSort<>(), new SexContext());
    }

    @Test
    public void bubbleSortAgeContextTest() {
        this.sortData(new BubbleSort<>(), new AgeContext());
    }

    @Test
    public void bubbleSortNameContextTest() {
        this.sortData(new BubbleSort<>(), new NameContext());
    }

    @Test
    public void gnomeSortSexContextTest() {
        this.sortData(new GnomeSort<>(), new SexContext());
    }

    @Test
    public void gnomeSortAgeContextTest() {
        this.sortData(new GnomeSort<>(), new AgeContext());
    }

    @Test
    public void gnomeSortNameContextTest() {
        this.sortData(new GnomeSort<>(), new NameContext());
    }
}
