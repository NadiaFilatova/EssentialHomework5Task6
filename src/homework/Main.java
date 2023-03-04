package homework;

import java.util.ArrayList;

//Використовуючи Intelij IDEA, створити проект, пакет.
// Створити class Main, у ньому створити список, додати вчителів, яких ви зможете згадати зі школи.
// І отримати індекс найкращого вчителя та самого не дуже. Вивести список у консоль.
public class Main {


    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add(0, "Alushta Andrii");
        teachers.add(1, "Borshchahivkа Borysenko");
        teachers.add(2, "Donetsk Dmytro");
        teachers.add(3, "Don Andrii");
        teachers.add(4, "Fastiv Dmytro");
        teachers.add(5, "Fastov Dmytro");
        teachers.add(6, "Kharkiv Dmytro");
        teachers.add(7, "Bila Pet");
        teachers.add(8, "Kotel Anna");
        teachers.add(9, "Dovha Nadia");
        teachers.add(10, "Motiko Ira");
        System.out.println(teachers.indexOf("Fastiv Dmytro") + " - this is the best teacher index");
        System.out.println(teachers.indexOf("Motiko Ira") + " - this is the worst teacher index");
        System.out.println(teachers + " -  list of teachers");
    }

}
