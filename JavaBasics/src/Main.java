import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String [] family = new String[5];
        family[0] = "Hassan";
        family[1] = "Sallay Koroma";
        family [2] = "Ya Yeabu Turay";
        family[4] = "Zainab Bangura";


        System.out.println(family[0]);
        System.out.println(family[4]);

        System.out.println(Arrays.toString(family));
        family[3] = "Matu";
        System.out.println(Arrays.toString(family));

        String [] friends = {"Joseph", "Joanna", "Mohamed"};
        System.out.println(friends[0]);
        System.out.println(friends.length);
        friends[1] = "Agness";
        System.out.println(friends[1]);

    }
}