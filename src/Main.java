//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        // ==========================================
    // Задача 2: Налоговый отдел
    // ==========================================
    System.out.println("\n--- Задача 2 ---");
    int[] inputArray2 = {50000, 85000, 120000, 45000, 95000};
    float[] outputArray2 = new float[inputArray2.length];

    int index2 = 0;
    for (int salary : inputArray2) {
        outputArray2[index2] = salary * 0.13f;
        index2++;
    }

    System.out.println("Input:  " + Arrays.toString(inputArray2));
    System.out.println("Output: " + Arrays.toString(outputArray2));

    // ==========================================
    // Задача 3: HR отдел
    // ==========================================
    System.out.println("\n--- Задача 3 ---");
    int[] inputArray3 = {4500, 7000, 5000, 12000, 3200};
    boolean[] outputArray3 = new boolean[inputArray3.length];

    int index3 = 0;
    for (int bonus : inputArray3) {
        outputArray3[index3] = bonus > 5000;
        index3++;
    }

    System.out.println("Input:  " + Arrays.toString(inputArray3));
    System.out.println("Output: " + Arrays.toString(outputArray3));

    // ==========================================
    // Задача 4: Кредитный отдел
    // ==========================================
    System.out.println("\n--- Задача 4 ---");
    // Пример с просрочкой (есть отрицательный баланс)
    int[] inputArray4 = {1500, 2300, -500, 4000, 1200};
    boolean[] outputArray4 = new boolean[1];

    boolean isAlwaysPositive = true;
    for (int balance : inputArray4) {
        if (balance < 0) {
            isAlwaysPositive = false;
            break; // Максимально быстрая проверка — прерываем цикл
        }
    }
    outputArray4[0] = isAlwaysPositive;

    System.out.println("Input:  " + Arrays.toString(inputArray4));
    System.out.println("Output: " + Arrays.toString(outputArray4));

    // ==========================================
    // Задача 5: CEO
    // ==========================================
    System.out.println("\n--- Задача 5 ---");
    int[] inputArray5 = {150000, -20000, 0, 450000, 80000};
    int[] outputArray5 = new int[1];

    int profitableMonthsCount = 0;
    for (int profit : inputArray5) {
        if (profit > 0) {
            profitableMonthsCount++;
        }
    }
    outputArray5[0] = profitableMonthsCount;

    System.out.println("Input:  " + Arrays.toString(inputArray5));
    System.out.println("Output: " + Arrays.toString(outputArray5));

    // ==========================================
    // Задача 1:
    // ==========================================
    int[] weights = {90, 91, 93, 92};
    System.out.println("\n--- Задача 1 ---");

    int sum = 0;
    int maxWeight = weights[0];
    int minWeight = weights[0];

// Тот самый один цикл, который делает всю «грязную» работу
    for (int current : weights) {
        sum += current;
        if (current > maxWeight) maxWeight = current;
        if (current < minWeight) minWeight = current;
    }

// РАСЧЕТ СРЕДНЕГО (делается строго ПОСЛЕ цикла)
// Важно: переводим sum в тип double (или float), чтобы деление было точным и с точкой!
    double average = (double) sum / weights.length;

    System.out.println("Сумма: " + sum);
    System.out.println("Максимум: " + maxWeight);
    System.out.println("Минимум: " + minWeight);
    System.out.println("Среднее: " + average); // Выведет 91.5

}