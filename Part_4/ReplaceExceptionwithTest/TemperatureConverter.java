package CodeSmells_lab_6.Part_4.ReplaceExceptionwithTest;

public class TemperatureConverter {
    public static double convertToCelsius(double fahrenheit) {
        if (fahrenheit < -459.67) {
            System.out.println("Помилка: Неприпустима температура: менше абсолютного нуля");
            return 0;
        }
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double fahrenheit = -500;
        double celsius = convertToCelsius(fahrenheit);

        if (celsius != 0) {
            System.out.println("Температура в градусах Цельсія: " + celsius);
        } else {
            System.out.println("Обчислення не можливе для введеної температури.");
        }
    }
}

