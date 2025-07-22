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
    }
}
