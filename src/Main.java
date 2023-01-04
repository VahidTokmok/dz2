import java.util.Random;
import java.util.RandomAccess;

public class Main {
    public static void main(String[] args) {

        stroll(30, 28);
        stroll(12, 18);
        stroll(50, -12);
        stroll(25, 65);
        stroll(18, -35);
        stroll(generateRandomAge(), -35);

    }
    public static String stroll(int age, int temperature){
        generateRandomAge();
        if(age >= 20 && age <= 40 && temperature >= -20 && temperature <= 30){
           return "Go to walk";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Go to walk!";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Stay home";
        }else {
            return "Stay home!";
        }
    }
    public static int generateRandomAge(){
        Random rand = new Random();
        int age = rand.nextInt(1, 99);
        return age;
    }
}
