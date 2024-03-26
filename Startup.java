import java.time.LocalDate;
import java.util.HashSet;
/**
 * Startup
 */
public class Startup {

    static int classLocal = 0;
    public static void main(String[] args) {

        Student student = new Student("New student");
        student.major = Major.BUSINESS;
        student.name = "Name";
        student.dateOfBirth = LocalDate.of(1994, 03, 23);

        System.out.println(student.toString());     
        System.out.println(student.toString("overloaded"));    
        System.out.println(student.getAge()); 

        Student student2 = new Student("New student", LocalDate.of(1994, 03, 23));
        student2.major = Major.COMPUTERSCIENCE;

        if(student.major == Major.BUSINESS) {
            System.out.println("Business");
        }
        
        Car car1 = new Car(CarMake.TESLA, CarModel.S, 2022);
        car1.setHorsePower(205);
        car1.setPowerType(PowerType.ELECTRIC);
        car1.setCarStyle(CarStyle.SEDAN);

        car1.Honk();
        System.out.println("default mileage: " + car1.getMileage());
        car1.Drive(35978.01);
        System.out.println("current mileage: " + car1.getMileage());
        System.out.println("Mileage in kms: " + Car.ConvertMileageToKilometers(car1.getMileage()));

        System.out.println("Number of Cars on road: " + Car.numberOfCars);

        Car car2 = new Car(CarMake.TOYOTA, CarModel.TACOMA, 2000);
        car2.setHorsePower(140);
        car2.setPowerType(PowerType.GAS);
        car2.setCarStyle(CarStyle.SUV);
  
        System.out.println(car2);
        System.out.println(car2.getYear());
        System.out.println(car1.getHorsePower());
        System.out.println(car2.getPowerType());

        System.out.println("Number of Cars on road: " + Car.numberOfCars);

        Instructor teacher = new Instructor();
        teacher.subject = Major.PSYCHOLOGY;
        teacher.email = "teacher@mail";

        /*Circle circle = new Circle();
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
        */
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
        inputString = inputString.toLowerCase();
        for(int i = 0; i < inputString.length(); i++) {              
            char tmp = inputString.charAt(i);            
            if(vowels.contains(tmp)) {
                res++;
            }
        }
        return res;
    }
}