
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person;
        List<Person> personList;
        personList = generateClients();
        while (!personList.isEmpty()){
            person = personList.get(0);
            System.out.println(person.name + " " + person.lastName + " прокатился");
            person.used();
            personList.remove(person);
            if (person.ticketNumbers > 0) {
                personList.add(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> persons = new LinkedList<>();
        persons.add(new Person("Петя", "Иванов", 2));
        persons.add(new Person("Рулон", "Обоев", 3));
        persons.add(new Person("Алексей", "Нетоложко", 2));
        persons.add(new Person("Сергей", "Сергеенко", 3));
        persons.add(new Person("Стас", "Кутепов", 3));
        return persons;
    }
}
