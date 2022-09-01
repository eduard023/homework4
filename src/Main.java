public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();

    }

    private static void task1() {
            //Задание 1
        System.out.println("Домашнее задание 1. Задача 1");
        int age = 11;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием.");
        }
        if (age < 18) {
            System.out.println("Возвраст совершеннолетия еще не наступил.");
        }


    }

    private static void task2() {
            //Задание 2
        System.out.println("Домашнее задание 1. Задача 2");
        int age = 24;
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if
        (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

    }

    private static void task3() {
            //Задание 3
        System.out.println("Домашнее задание 1. Задача 3");
        int totalSpace = 102;
        int seating = 60;
        int people = 84;
        if (people < seating) {
            System.out.println("Остались сидячие и стоячие места.");
        }
        if (people < totalSpace && people >= seating) {
            System.out.println("Есть только стоячие места.");
        }
        if (people >= totalSpace) {
            System.out.println("Мест нет.");
        }
    }

    private static void task4() {
        //Задание 4
        System.out.println("Домашнее задание 2. Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием.");
        } else {
            System.out.println("Возвраст совершеннолетия еще не наступил.");
        }

    }

    private static void task5() {
        //Задание 5
        System.out.println("Домашнее задание 2. Задача 2");
        int age = 19;
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу.");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

    }

    private static void task6() {
        //Задание 6
        System.out.println("Домашнее задание 2. Задача 3");
        int totalSpace = 102;
        int seating = 60;
        int people = 60;
        if (people < seating) {
            System.out.println("Остались сидячие и стоячие места.");
        } else if (people < totalSpace && people >= seating) {
            System.out.println("Есть только стоячие места.");
        } else {
            System.out.println("Мест нет.");
        }
    }

    private static void task7() {
        //Задание 7
        System.out.println("Домашнее задание 3. Задача 1");
        int age = 24;
        boolean kindergarten = (age >= 2 && age <= 6);
        boolean school = (age >= 7 && age <= 18);
        boolean university = (age > 18 && age < 24);
        if (kindergarten) {
            System.out.println("Если возвраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (school) {
            System.out.println("Если возвраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (university) {
            System.out.println("Если возвраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возвраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
    }

    private static void task8() {
        //Задание 8
        System.out.println("Домашнее задание 3. Задача 2");
        int age = 14;
        boolean not = (age < 5);
        boolean withParents = (age >= 5 && age < 14);
        if (not){
            System.out.println("Кататься нельзя.");
        } else if (withParents){
            System.out.println("Кататься можно только с сопровождением родителей.");
        } else {
            System.out.println("Кататься можно.");
        }

    }

    private static void task9() {
        //Задание 9
        System.out.println("Домашнее задание 3. Задача 3");
        int one = 5;
        int two = 21;
        int free = 15;
        boolean a = (one > two && one > free);
        boolean b = (two > one && two > free);
        if (a) {
            System.out.println("Большее число one = " + one);
        } else if (b){
            System.out.println("Большее число two = " + two);
        } else {
            System.out.println("Большее число free = " + free);
        }

    }
}