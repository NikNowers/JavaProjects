package prak4;
import java.lang.*;
public class Author {
    private final String name;
    private String email;
    private final char gender;
    public Author (String a,String b, char c){
        name=a;
        email=b;
        gender=c;
    }
    public Author (String a,char c){
        name=a;
        email="none";
        gender=c;
    }
    public String getName(String name) {
        return name;
    }

    public String getEmail(String email) {
        return email;
    }

    public char getGender(char gender) {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return this.name + " " + this.gender + " at " + this.email;
    }
}
