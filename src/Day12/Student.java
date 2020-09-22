package Day12;


public class Student extends Person {


    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] testScore) {
        super(firstName, lastName, id);
            this.testScores = testScore;
    }

    char calculate() {
        int i;
        int sum = 0;
        int avg;
        char grade = ' ';

        for (i=0; i< testScores.length; i++) {
            sum += testScores[i];
        }
            avg = sum/ testScores.length;

            if (avg<=100 && avg >=90) {
                grade = 'O';
            } else if (avg >= 80) {
                grade = 'E';
            } else if (avg >= 70) {
                grade = 'A';
            } else if (avg >= 55) {
                grade = 'P';
            } else if (avg >= 40) {
                grade = 'D';
            } else {
                grade = 'T';
            }

        return grade;
    }


}
