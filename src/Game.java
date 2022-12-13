import java.util.Random;

public class Game {
    Random random = new Random();


    public void randomGame(){  // game between computer(s)

        int a = random.nextInt(3) +1; // Диапазон от 1 до 3
        int b = random.nextInt(3) +1;
        String str1 = "";
        String str2 = "";

        if(a == 1){
            str1 = "Бумага";
        } else if (a == 2) {
            str1 = "Ножницы";
        } else if (a == 3){
            str1 = "Камень";
        }

        if(b == 1){
            str2 = "Бумага";
        } else if (b == 2) {
            str2 = "Ножницы";
        } else if (b == 3){
            str2 = "Камень";
        }
        System.out.println(rsp(str1, str2));
    }

    public String rsp(String str1, String str2) {
        if(str1.equals("Ножницы") && str2 == "Бумага"){
            return "Игрок 1 победил";
        }
        else if(str1 == "Ножницы" && str2 == "Камень"){
            return  "Игрок 2 победил";
        }
        if(str1 == "Камень" && str2 == "Бумага"){
            return "Игрок 2 победил";
        }
        else if(str1 == "Камень" && str2 == "Ножницы"){
            return  "Игрок 1 победил";
        }
        if(str1 == "Бумага" && str2 == "Камень"){
            return "Игрок 1 победил";
        }
        else if(str1 == "Бумага" && str2 == "Ножницы"){
            return  "Игрок 2 победил";
        } else
            return "Ничья";


    }
    public void singleGame(){
        int a = random.nextInt(3)+ 1; // Диапазон от 1 до 3
        System.out.println("Сделайте свой ход (Камень, Ножницы, Бумага)");
        String str1 = "";

        if(a == 1){
            str1 = "Бумага";
        }
        else if(a == 2){
            str1 = "Ножницы";
        }
        else if(a == 3){
            str1 = "Камень";
        }

        String str2 = Main.scanner.next();
        str2 = str2.trim();
        System.out.println(str2);
        System.out.println(rsp(str1, str2));

        System.out.println("Ход компьютера: " + str1 + " Ход человека: " + str2);
    }
}
