//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int p = 120;
        int min1 = 50;
        int max1 = 100;

        if (p > min1 && p < max1) {
            System.out.println("Число a: " + p + "міститься в проміжку " + min1 + max1);
        } else {
            System.out.println("Число a: " + p + "не міститься в проміжку " + min1 + max1);
        }


        int a = 657;
        int b = a % 10;
        a /= 10;
        int c = a % 10;
        a /= 10;
        int d = a;
        int f = Math.max(d, Math.max(c, b));
        System.out.println("Найбільша цифра" + f);


        String option = "Так";
        switch (option) {
            case "Так":
            case "Ок":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь");
                break;
            default:
                System.out.println("Невірне твердження");

        }
        int floor = 1;
        int ourfloor = 6;
        if (ourfloor > floor && ourfloor <= 9) {
            if (ourfloor == 4g) {
                System.out.println("Піднімаємось на 3-й поверх.");
                ourfloor = 3;
            }
            System.out.println("Ви піднялись на " + (ourfloor - floor) + " поверх.");
        } else if (ourfloor < floor && ourfloor >= 1) {
            if (ourfloor == 2) {
                System.out.println("Спускаємось на 1-й поверх.");
                ourfloor = 1;
            }
            System.out.println("Ви спустились на " + (floor - ourfloor) + " поверх.");
        } else {
            System.out.println("Такого поверху немає.");
        }
    }
}
