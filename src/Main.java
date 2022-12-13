import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int[] myArray = createArray();

    public static void main(String[] args) {
        mathOp();
        createArray();
        randomNumFiller();
        showArr();
        System.out.println();
        sortArrUp(myArray);
        showArr();
        System.out.println();
        sortArrDown(myArray);
        showArr();

        //    5*) Реалиовать игру "Камень, ножницы, бумага"

        Game game = new Game();

        int i = 0;

        while (i<10){
            game.randomGame();
            i++;
        }

        game.singleGame();


//        1) Создать калькулятор(+, -, *, /) в бесконечном цикле...
        while (true) {
            System.out.println();
            System.out.println("Enter operation: \n" + "multiply - *\n" + "Divide - /\n" + "add - +\n" +
                    "sub - -\n" + "Exit - e \n");
            char ch = scanner.next().charAt(0);
            if (ch == '*') {
                multiply();
            } else if (ch == '/') {
                System.out.println("Enter first number");
                int a = scanner.nextInt();
                System.out.println("Enter second number");
                int i1 = scanner.nextInt();
                div(i, i1);
            } else if (ch == '+') {
                System.out.println("Enter first number");
                int a = scanner.nextInt();
                System.out.println("Enter second number");
                int i1 = scanner.nextInt();
                add(i, i1);
            } else if (ch == '-') {
                System.out.println("Enter first number");
                int a = scanner.nextInt();
                System.out.println("Enter second number");
                int i1 = scanner.nextInt();
                sub(i, i1);
            } else if (ch == 'e') {
                System.out.println("Thank you!");
                break;
            }
        }
    }



    private static void add ( int i, int i1){
        System.out.println("Your number : " + (i + i1));
    }

    private static void sub ( int i, int i1){
        System.out.println("Your answer : " + (i - i1));
    }


    private static void div ( int i, int i1){
        System.out.println("divided = " + i / i1);

    }

    //   но считать в функции
    private static void multiply () {
        System.out.println("Enter first number");
        int i = scanner.nextInt();
        System.out.println("Enter second number");
        int i1 = scanner.nextInt();
        System.out.println("multiplied = " + i * i1);
    }


    //         2) Создать методы, для создания массива,
    public static int[] createArray () {
        myArray = new int[10];
        return myArray;
    }

    //заполнения его случайными числами
    public static void randomNumFiller () {
        for (int i = 0; i < myArray.length; ++i) {
            myArray[i] = random.nextInt(10);
        }
    }

    //и вывода на консоль.
    public static void showArr () {
        for (int i = 0; i < myArray.length; ++i) {
            System.out.print(myArray[i] + " ");
        }

    }


//  3) Метод для сортировки массива пузырьком по возрастанию

    private static int[] sortArrUp(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr.length; ++j) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    // и убыванию
    private static int[] sortArrDown(int[] myArray1) {
        for (int i = 0; i < myArray1.length / 2; i++) {
            int temp = myArray1[i];
            myArray1[i] = myArray1[myArray1.length - 1 - i];
            myArray1[myArray1.length - 1 - i] = temp;
        }

        return myArray1;
    }


    //    4) Создать метод для возведения в степень числа и *извлечения корня 3 степени из числа.
    public static void mathOp(){
        System.out.println("Введите число для страшных математических операций");
        double i = scanner.nextInt();
        System.out.println("Введите степень");
        double i1 = scanner.nextInt();
        System.out.println("Степень " + Math.pow(i, i1));
        double i3 = (double) Math.pow((Math.pow(i, i1)), 1./3.);
        System.out.println("Result " + i3);
    }



}

