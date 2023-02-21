import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<Person> generateClients() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Вольфганг", "Речицки", 2));
        personList.add(new Person("Васисуалий", "Лоханкин", 3));
        personList.add(new Person("Барби", "Гаррибас", 4));
        personList.add(new Person("Гортензия", "Флорентийская", 3));
        personList.add(new Person("отец", "Картоний", 5));
        return (personList);
    }

    public static void main(String[] args) {
        Queue<Person> queueAttraction = new LinkedList<>(generateClients());
        while (!queueAttraction.isEmpty()) {
            Person person;
            person = queueAttraction.poll();
            System.out.println(person.name + " " + person.surname + " " + "прокатился на аттракционе");
            person.removeTicket();
            System.out.println("У него осталось " + person.tickets + " билетов");
            if (person.tickets == 0) {
                continue;
            }
            queueAttraction.offer(person);
        }

    }

}
