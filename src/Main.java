public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte glass = -120;
        short glass1 = 5000;
        int glass2 = 1000000;
        long glass3 = 500000000;
        float glass4 = 3.5f;
        double glass5 = 3.568888888;
        System.out.println("Задача 1");
        System.out.println("Значение переменной glass c типом byte равно " +  glass);
        System.out.println("Значение переменной glass1 c типом short равно "  +  glass1);
        System.out.println("Значение переменной glass2 c типом int равно "  + glass2);
        System.out.println("Значение переменной glass3 c типом long равно "  + glass3);
        System.out.println("Значение переменной glass4 c типом float равно "  + glass4);
        System.out.println("Значение переменной glass5 c типом double равно "  + glass5);
        //Задача 2
        double value = 27.12;
        long value1 = 987678965549L;
        float value2 = 2.786f;
        int value6 = 569;
        short value3 = -159;
        short value5 = 27897;
        byte value4 = 67;
        //Задача 3
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int papers = 480;
        int papersPerStudent = papers / (class1 + class2 + class3);
        System.out.println("Задача 3");
        System.out.println("На каждого ученика рассчитано " + papersPerStudent + " листов бумаги");
        //Задача 4
        int productivityIn2Minutes = 16;
        int productivityIn1Minutes = 8;
        int productivityIn20Minutes = 8 * 20;
        int productivityPerDay = 24 * 60 * 8;
        int productivityIn3Days = 3 * 24 * 60 * 8;
        int productivityFor1Month = 30 * 24 * 60 * 8;
        System.out.println("Задача 4 ");
        System.out.println("За 20 минут машина произвела " + productivityIn20Minutes + " штук бутылок");
        System.out.println("За сутки " + productivityPerDay + " штук бутылок");
        System.out.println("За 3 дня " + productivityIn3Days + " штук бутылок");
        System.out.println("За 1 месяц " + productivityFor1Month + " штук бутылок");
        //Задача 5
        int banks = 120;
        int cansFor1ClassWhitePaint = 2;
        int cansFor1ClassBrownPaint = 4;
        int cansForClass1 = cansFor1ClassWhitePaint + cansFor1ClassBrownPaint;
        int numberOfClasses = banks / cansForClass1;
        int cansFor20ClassWhitePaint = numberOfClasses * cansFor1ClassWhitePaint;
        int cansFor20ClassBrownPaint = numberOfClasses * cansFor1ClassBrownPaint;
        System.out.println("Задача 5");
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + cansFor20ClassWhitePaint + " банок белой краски и " + cansFor20ClassBrownPaint + " банок коричневой краски");
        //Задача 6
        int weightOfOneBananaInGrams = 80;
        int weightOfOneServingOfMilkInGrams = 105;
        int weightOfOneServingOfIceCreamInGrams = 100;
        int weightOfOneRawEggInGrams = 70;
        int weightOfFiveBananasInGrams = 80 * 5;
        int weightOfTwoServingOfMilkInGrams = 105 * 2;
        int weightOfTwoServingOfIceCreamInGrams = 100 * 2;
        int weightOfFourRawEggInGrams = 70 * 4;
        int totalWeightOfSportsBreakfastInGrams = weightOfFiveBananasInGrams + weightOfTwoServingOfMilkInGrams + weightOfTwoServingOfIceCreamInGrams + weightOfFourRawEggInGrams;
        float totalWeightOfSportsBreakfastInKilograms = totalWeightOfSportsBreakfastInGrams / 1000f;
        System.out.println("Задача 6");
        System.out.println("Вес завтрака в граммах равен " + totalWeightOfSportsBreakfastInGrams);
        System.out.println("Вес завтрака в килограммах равен " + totalWeightOfSportsBreakfastInKilograms);
        //Задача 7
        int weightDifference = 7;
        int weightDifferenceInGrams = 7 * 1000;
        int DailyWeightLoss1 = 250;
        int DailyWeightLoss2 = 500;
        System.out.println("Задача 7");
        int numberOfDaysWithALossOf250Grams = weightDifferenceInGrams / DailyWeightLoss1;
        int numberOfDaysWithALossOf500Grams = weightDifferenceInGrams / DailyWeightLoss2;
        System.out.println(numberOfDaysWithALossOf250Grams + " дней уйдет на весосгонку");
        System.out.println(numberOfDaysWithALossOf500Grams + " дней уйдет на весосгонку");
        //Задача 8
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float newMashaSalary = mashaSalary * 1.1f;
        float newDenisSalary = denisSalary * 1.1f;
        float newKristinaSalary = kristinaSalary * 1.1f;
        float differenceInMashaSalary = newMashaSalary - mashaSalary;
        float differenceInDenisSalary = newDenisSalary - denisSalary;
        float differenceInKristinaSalary = newKristinaSalary - kristinaSalary;
        System.out.println("Задача 8");
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + differenceInMashaSalary + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + differenceInDenisSalary + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + differenceInKristinaSalary + " рублей");











    }
}