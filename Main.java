public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = findLargerNumber(5, 9);
        System.out.println("Большее число: " + result);

        int boxesCount = 3; // Количество коробок
        int bagsCount = 4;   // Количество мешков
        int barrelsCount = 2; // Количество бочек

        int totalItems = calculateTotalItems(boxesCount, bagsCount, barrelsCount);
        System.out.println("Общее количество товаров на складе: " + totalItems);

        int x = 5;
        int y = 5;
        int z = 5;

        String triangleType = determineTriangleType(5, 5, 5);
        System.out.println("Тип треугольника: " + triangleType);

        int trainingTimeInMinutes = 15; // Пример: время тренировки в минутах
        int intensityLevel = 1; // Пример: интенсивность тренировки (1 - низкая, 2 - средняя, 3 - высокая)

        double caloriesBurned = calculateCaloriesBurned(trainingTimeInMinutes, intensityLevel);
        System.out.println("Количество сожженных калорий: " + caloriesBurned + " ккал");

        int gallons = 10; // Пример: количество галлонов для преобразования
        float liters = convert(gallons);
        System.out.println(gallons + " галлонов = " + liters + " литров");

        double fabricLengthInMeters = 10.0; // Длина ткани в метрах
        double widthOfPieceInMeters = 1.5; // Ширина детали в метрах
        double lengthOfPieceInMeters = 2.0; // Длина детали в метрах

        int numberOfBeddings = calculateBeddings(fabricLengthInMeters, widthOfPieceInMeters, lengthOfPieceInMeters);
        System.out.println("Количество пододеяльников, которые можно сшить: " + numberOfBeddings);
    }

    public static int calculateTotalItems(int boxesCount, int bagsCount, int barrelsCount) {
        // Количество товаров в каждом типе емкости
        int itemsInBox = 20;
        int itemsInBag = 50;
        int itemsInBarrel = 100;

        // Общее количество товаров на складе
        int totalItems = (boxesCount * itemsInBox) + (bagsCount * itemsInBag) + (barrelsCount * itemsInBarrel);

        return totalItems;
    }

    public static String determineTriangleType(int x, int y, int z) {
        if (x <= 0 || y <= 0 || z <= 0) {
            return "Не является треугольником"; // Отрицательные или нулевые стороны не могут образовать треугольник.
        }

        if (x + y <= z || x + z <= y || y + z <= x) {
            return "Не является треугольником"; // Неравенство треугольника: сумма любых двух сторон должна быть больше третьей стороны.
        }

        if (x == y && y == z) {
            return "Равносторонний треугольник";
        } else if (x == y || x == z || y == z) {
            return "Равнобедренный треугольник";
        } else {
            return "Разносторонний треугольник";
        }
    }

    public static double calculateCaloriesBurned(int minutes, int intensity) {
        double caloriesPerMinute = 0;

        switch (intensity) {
            case 1:
                caloriesPerMinute = 1.0; // Низкая интенсивность
                break;
            case 2:
                caloriesPerMinute = 2.0; // Средняя интенсивность
                break;
            case 3:
                caloriesPerMinute = 3.0; // Высокая интенсивность
                break;
        }

        return caloriesPerMinute * minutes;
    }
    public static int findLargerNumber(int a, int b) {
        // Используем тернарный оператор для сравнения чисел и возврата большего
        int largerNumber = (a > b) ? a : b;
        return largerNumber;
    }

    public static float convert(int x) {
        float gallon = 3.785f;
        return x * gallon;
    }

    public static int calculateBeddings(double fabricLengthInMeters, double widthOfPieceInMeters, double lengthOfPieceInMeters) {
        if (fabricLengthInMeters <= 0 || widthOfPieceInMeters <= 0 || lengthOfPieceInMeters <= 0) {
            throw new IllegalArgumentException("Неверные входные данные. Длина и ширина должны быть больше нуля.");
        }

        double fabricAreaInSquareMeters = fabricLengthInMeters * widthOfPieceInMeters * 2; // Учитываем оба слоя ткани
        double pieceAreaInSquareMeters = widthOfPieceInMeters * lengthOfPieceInMeters;

        int numberOfBeddings = (int) (fabricAreaInSquareMeters / pieceAreaInSquareMeters);

        return numberOfBeddings;
    }
}