import java.util.Scanner;

public class Day4 {



    private int age;

    public void Person(int initialAge) {
        if(initialAge < 0){ // podany wiek jest mniejszy od 0. Wtedy ustawia domyślnie wrtość 0.
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
        else{ // wpisana wartość wieku jest ok.
            this.age = initialAge;
        }
    }

    public void amIOld() {
        // Set correct statement to print
        String result = "";
        if(age >= 18){
            result = "You are old.";
        }
        else if(age >=13){
            result = "You are a teenager.";
        }
        else{
            result = "You are young.";
        }
        System.out.println(result);
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age++;
    }
}
