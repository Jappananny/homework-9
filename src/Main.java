public class Main {
    public static void main(String[] args) {
        String firsName="Ivan";
        String middleName="Ivanovich";
        String lastName="Ivanov";
        String fullName= lastName+' '+firsName+' '+middleName;
        fullName= fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName);
    }
}