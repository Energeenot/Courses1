package late_and_early_binding_examples;

public class test {
    public static void main(String[] args) {

        Person person = new Person();

         Animal animal = person;
         animal.live();//Восходящее преобразование

         Person person1 = (Person) animal;
         person.to_reason();//Нисходящее преобразование

    }
}
