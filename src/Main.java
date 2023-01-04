public class Main {
    public static void main(String[] args) {

        System.out.println(stroll(30, 28));
        System.out.println(stroll(12, 18));
        System.out.println(stroll(50, -12));
        System.out.println(stroll(25, 65));
        System.out.println(stroll(18, -35));
    }
    public static String stroll(int age, int temperature){

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
}
