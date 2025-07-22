public class gradeManager {
    public static String[] reverseStudentNames(String[] names) {
        String[] reversed = new String[names.length];
        int n = names.length;

        for (int i = 0; i < n; i++) {
            String original = names[i];
            String reversedName = "";

            for (int j = original.length() - 1; j >= 0; j--) {
                reversedName += original.charAt(j);
            }

            reversed[i] = reversedName;
        }

        return reversed;
    }

    public static void main(String[] args) {
        String[] students = {"John", "Alice", "Bob"};
        String[] reversed = reverseStudentNames(students);

        System.out.println("Original vs Reversed:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " -> " + reversed[i]);
        }

        String[] students1 = {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {95, 67, 45, 78};

        System.out.println("Find failing student  :\n");
        findFailingStudents(students1,scores);
    }
    public static char getLetterGrade(int score){
        if (score >=90 || score <=100){
            return 'A';
        } else if(score >=80 || score <=89){
            return 'B';
        } else if(score >=70 || score <=79){
            return 'C';
        } else if(score >=60 || score <=60){
            return 'D';
        } else {
            return 'F';
        }
    }

    public static String[] findFailingStudents(String[] names, int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                count++;
            }
        }

        String[] failing = new String[count];
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                failing[index] = names[i];
                index++;
            }
        }

        return failing;
    }
}
