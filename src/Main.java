import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String firsName="Семён";
        String middleName="Семёнович";
        String lastName="Иванов";
        String fullName= lastName+' '+firsName+' '+middleName;
        if (fullName.contains("ё"));{       //Мне кажеться подсказка в задаче не коректна
            fullName = fullName.replace("ё","e");
            System.out.println("Данные ФИО сотрудника  — "+fullName.toUpperCase());
        }
    }
}