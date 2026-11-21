import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("24 часа Ле-Мана" +
                "Гонка начинается! Нужны данные участников");

        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            String name;
            int speed;
            Car newCar;

            System.out.println("Введите название " + i + "-го автомобиля");
            name = scanner.nextLine();
            if (name.trim().isEmpty()) {
                System.out.println("Не оставляйте поле пустым");
                i--;
                continue;
            }

            while (true) {
                try {
                    System.out.println("Введите скорость " + i + "-го автомобиля");
                    speed = scanner.nextInt();
                    scanner.nextLine();
                }
                catch (Exception ex) {
                    System.out.println("Некорректный ввод, повторите действие");
                    scanner.nextLine();
                    continue;
                }

                if (speed >= 0 && speed <= 250) {
                    newCar = new Car(name, speed);
                    race.findTheLeader(newCar);
                    break;
                }
                else {
                    System.out.println("Ошибка, ожидается значение от 0 до 250");
                }
            }
        }

        if (race.leadersDistance == 0) {
            System.out.println("\nНевозможно определить лидера, расстояние каждого участника - 0 км");
        }
        else {
            System.out.println("\nЛидеры гонки - " + race.leadersName);
        }

        scanner.close();
    }
}