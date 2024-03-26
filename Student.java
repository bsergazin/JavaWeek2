import java.time.LocalDate;
import java.time.Period;

enum Major {COMPUTERSCIENCE, BUSINESS, PSYCHOLOGY, COMMUNICATIONS};

public class Student {
    String name;
    double GPA;   
    boolean isVet; 
    int luckyNum;
    Major major;
    LocalDate dateOfBirth;

    // Constructor
    //public Student() {
    //    GPA = 1.0;
    //    isVet = false;
    //}

    public Student(String name) {
        this.name = name;
    }

    public Student (String name, LocalDate dob) {
        this.name = name;
        this.dateOfBirth = dob;
    }

    //overriding toString method
    public String toString(){
        return name + " " + major;
    }

    public String toString(String stringParam) {
        return name + " " + major + " " + stringParam;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }


}
