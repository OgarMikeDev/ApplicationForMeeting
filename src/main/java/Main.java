import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int foundHeight = 173;
        int foundAge = 21;
        double foundWeight = 55.1;
        String foundHobby = "Бизнес-литература";
        String foundMainClass = "Учёба";
        boolean havePartner = false;

        while (!havePartner) {
            System.out.println("Введите свой рост в см: ");
            int height = new Scanner(System.in).nextInt();

            System.out.println("Введите свой возраст: ");
            int age = new Scanner(System.in).nextInt();

            System.out.println("Введите свой вес: ");
            double weight = new Scanner(System.in).nextDouble();

            System.out.println("Назовите своё хобби: ");
            String hobby = new Scanner(System.in).nextLine();

            System.out.println("Расскажите, чем занимаетесь в основное время: ");
            String mainClass = new Scanner(System.in).nextLine();

            havePartner = ((height >= foundHeight - 23 || height <= foundHeight + 3) &&
                    (age >= foundAge - 3 || age <= foundAge + 1) &&
                    (weight >= foundWeight - 15.9 || weight <= foundWeight + 4.9) &&
                    (hobby.compareToIgnoreCase(foundHobby) == 0 || hobby.toLowerCase().contains(foundHobby.toLowerCase())) &&
                    (mainClass.compareToIgnoreCase(foundMainClass) == 0 || mainClass.toLowerCase().contains(foundMainClass.toLowerCase()))) ? true : false;

            if (!havePartner) {
                System.out.println("Попробуем поискать ещё, Вы не подошли по указанным параметрам :(");
            }
        }
        System.out.println("Ваша половинка нашлась :)");
    }
}
