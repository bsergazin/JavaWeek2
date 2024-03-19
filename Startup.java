import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


/**
 * Startup
 */
public class Startup {

    static int classLocal = 0;
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5;

        System.out.println("Circle 1 rad " + circle.radius);

        Circle circle2 = new Circle();
        System.out.println("Circle 2 rad " + circle2.radius);

        int radius = 5;
        System.out.println("radius 1 " + radius);

        int radius2 = 10;
        System.out.println("radius 2 " + radius2);

        String name = "name";
        String name1 = "name";

        System.out.println(name == name1);

        System.out.println(name.substring(2));

        Student st = new Student();
        st.name = "name";
        System.out.println(st.name);

        st.GPA = 3.5f;

        System.out.println("vowels = " + calcVowels("vowels TO SeArch"));
    }

    public static double harmonic(int n) {
        int local = 0;
        System.out.println(local);
        System.out.println(classLocal);

        for(int i = 0; i < 3; i++ ) {
            int forLocal = 3;
            System.out.println(forLocal);
        }        
        return n;
    }

    public static int calcVowels(String inputString) {
        int res = 0;
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('Y');

        for(int i = 0; i < inputString.length(); i++) {              
            char tmp = inputString.charAt(i);
            if(vowels.contains(tmp)) {
                res++;
            }
        }
        return res;
    }

}