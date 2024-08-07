//1. Создать возвращаемый метод с названием “permission”, который будет принимать 2 входящих параметра - возраст человека
//и температуру на улице, и возвращать результат в виде строки.
//2. Алгоритм метода должен работать следующим образом:
//        - если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов, то возвращаемый результат
//- “Можно идти гулять”;
//- если же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов, то результат снова
//-“Можно идти гулять”;- а если человеку больше 45 лет, то результат “Можно идти гулять” формируется только тогда когда на
//        улице температура в диапазоне от -10 до 25 градусов;
//- в остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
//3. В методе main вызвать написанный метод 5 раз с различными входными данными (аргументами) и распечатать
//результат в консоль.
//4. Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
//5. При вызове метода “permission”, который формирует результат “можно ли идти гулять” использовать генерирование
//случайного возраста с помощью метода “generateRandomAge”
//НАПРИМЕР: Было - permission(23, 10); Меняете на - permission(generateRandomAge(), 10);

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(23,25));
        System.out.println(permission(15,35));
        System.out.println(permission(68,-20));
        System.out.println(permission(45,21));
        System.out.println(permission(18,-10));

        System.out.println(permission(generateRandomAge(),5));
    }
    public static String permission(int age, int temperature){
        if (age >= 20 && age <=45 && temperature >=-20 && temperature <=30){
            return "Можно идти гулять";
        }
        else if (age<20 && temperature>=0 && temperature <=28) {
            return "Можно идти гулять";
        }
        else if (age>45 && temperature>=-10 && temperature<=25 ) {
            return "Можно идти гулять";
        }
        else {
            return "Оставайтесь дома";
        }

    }
    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}