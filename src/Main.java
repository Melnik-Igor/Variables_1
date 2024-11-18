public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    var dog = 8.0;
        System.out.println("dog = " + dog);
    var cat = 3.6;
        System.out.println("cat = " + cat);
    var paper = 73789;
        System.out.println("paper = " + paper);

        dog += 4;
        System.out.println("dog + 4 = " + dog);
        cat += 4;
        System.out.println("cat + 4 = " + cat);
        paper += 4;
        System.out.println("paper + 4 = " + paper);

        dog -= 3.5;
        System.out.println("dog - 3.5 = " + dog);
        cat -= 1.6;
        System.out.println("cat - 1.6 = " + cat);
        paper -= 7639;
        System.out.println("paper - 7639 = " + paper);

    var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend + 2 = " + friend);
        friend /= 7;
        System.out.println("friend / 7 = " + friend);

    var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog * 10 = " + frog);
        frog /= 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog += 4;
        System.out.println("frog + 4 = " + frog);

    var boxer1 = 78.2;
        System.out.println("Вес первого боксера " + boxer1 + " кг.");
    var boxer2 = 82.7;
        System.out.println("Вес второго боксера " + boxer2 + " кг.");
    var totalWeightBoxer = boxer1 + boxer2;
        System.out.println("Общая масса двух бойцов " + totalWeightBoxer + " кг.");
    var difWeightBoxers = boxer2 - boxer1;
        System.out.println("Разница между массами бойцов " + difWeightBoxers + " кг.");

    var remains = (boxer2 / boxer1) % totalWeightBoxer;
        System.out.println("Остаток от деления между двумя весами " + difWeightBoxers + " кг.");

    var totalNumWorkHours = 640;
        System.out.println(totalNumWorkHours + " часов работы поделено между сотрудниками.");
    var eachEmplDedWork = 8;
        System.out.println("Каждый сотрудник посвящает работе " + eachEmplDedWork + " часов.");
    var numberEmployees = totalNumWorkHours / eachEmplDedWork;
        System.out.println("Всего работников в компании — " + numberEmployees + " человек.");
    var econdPartStaff = 94;
        System.out.println("В компании работает на " + econdPartStaff + " человек больше.");
    var totalNumEmplWork = numberEmployees + econdPartStaff;
        System.out.println("Всего работает в компании " + totalNumEmplWork + " человек.");
    var openingHours = totalNumWorkHours / totalNumEmplWork;
        System.out.println("Если в компании работает " + totalNumEmplWork + " человек, то всего "
                + openingHours + " часа работы может быть поделено между сотрудниками.");



    }
}