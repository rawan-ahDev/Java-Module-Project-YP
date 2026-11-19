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

            while (true) {
                try {
                    System.out.println("Введите название " + i + "-го автомобиля");
                    name = scanner.next();
                    System.out.println("Введите скорость " + i + "-го автомобиля");
                    speed = scanner.nextInt();
                }
                catch (Exception ex) {
                    System.out.println("Некорректный ввод, повторите действие");
                    scanner.next();
                    continue;
                }

                if (speed >= 0 && speed <= 250) {
                    newCar = new Car(name, speed);
                    race.findTheLeader(newCar);
                    System.out.println("\nЛидер гонки - " + race.leadersName);
                    break;
                }
                else {
                    System.out.println("Ошибка, ожидается значение от 0 до 250");
                }
            }
        }

        scanner.close();
    }
}