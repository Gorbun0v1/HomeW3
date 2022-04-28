public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println();
        for (int f = 10; f > 0; f--)
        {
            System.out.print(" " + f);
        }
        System.out.println("\n");
        System.out.println("Задание №2");
        int friday = 6;
        while (friday < 31)
        {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;

        }
        System.out.println("\n");
        System.out.println("Задание №3");
        int year = 2022;
        for (int Year = year - 200; Year < year + 100; Year = Year + 1) {
            if (Year % 79 == 0)
                System.out.println(Year);
        }



    }
}