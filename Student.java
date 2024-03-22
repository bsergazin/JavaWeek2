import java.time.LocalDate;
import java.time.Period;

enum Major {COMPUTERSCIENCE, BUSINESS, PSYCHOLOGY, COMMUNICATIONS};

public class Student {
    String name = "new student";
    float GPA;   
    boolean isVet; 
    int luckyNum;
    Major major;
    LocalDate dateOfBirth;

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
