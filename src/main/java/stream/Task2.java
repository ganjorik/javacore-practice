package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 16, Sex.MAN),
                new People("Елена", 16, Sex.WOMAN),
                new People("Артем", 26, Sex.MAN),
                new People("Маша", 17, Sex.WOMAN),
                new People("Кирилл", 87, Sex.MAN),
                new People("Иван Иванович", 69, Sex.MAN)
        );

        /*List<People> peopleList1 = peoples.stream().
                filter(p -> p.getAge() >= 18 && p.getAge() <= 27 && p.getSex() == Sex.MAN)
                .collect(Collectors.toList());
        peopleList1.forEach(System.out::println);

        double averageAge = peoples.stream().filter(p -> p.getSex() == Sex.MAN)
                .mapToInt(People::getAge).average().getAsDouble();

        System.out.println(averageAge);

        List<People> peopleList2 = peoples.stream().
                filter(p -> p.getAge() >= 18)
                .filter(p -> (p.getSex() == Sex.MAN && p.getAge() < 60) ||
                        (p.getSex() == Sex.WOMAN && p.getAge() < 55))
                .collect(Collectors.toList());

        System.out.println(peopleList2);*/


        peoples.stream()
                .sorted(new PeopleAgeComporator().thenComparing(new PeopleNameComporator()))
                .forEach(System.out::println);


    }
}

class PeopleAgeComporator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o1.getAge() - o2.getAge();
    }
}

class PeopleNameComporator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


class People {
    private String name;
    private int age;
    private Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String getName() { return name; }

    public void setName(String name) {this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public Sex getSex() {return sex;}

    public void setSex(Sex sex) {  this.sex = sex;   }
}

enum Sex {
    MAN,
    WOMAN
}
