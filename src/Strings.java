public class Strings {
    public static void main(String[] args) {

        System.out.println("\nTask 1:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.format("%s %s %s", lastName, firstName, middleName);
        System.out.println("Full name of the employee - " + fullName);

        System.out.println("\nTask 2:");
        task2(fullName);

        System.out.println("\nTask 3:");
        task3();

        System.out.println("\nTask 4:");
        task4(fullName);

        System.out.println("\nTask 5:");
        task5();

        System.out.println("\nTask 6:");
        task6();

        System.out.println("\nTask 7:");
        task7();
    }

    private static void task2(String fullName) {
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Full name of the employee to fill out the report - " + upperCaseFullName);
    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String correctFullName = fullName.replace('ё', 'е');
        System.out.println("Full name of the employee - " + correctFullName);
    }

    private static void task4(String fullName) {
        String firstName, middleName, lastName;
        lastName = fullName.substring(0, fullName.indexOf(' '));
        firstName = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
        middleName = fullName.substring(fullName.lastIndexOf(' '));
        System.out.printf("Name of employee - %s\nSurname of employee - %s\nMiddle name of the employee - %s\n",
                firstName, lastName, middleName);
    }

    private static void task5() {
        String fullName = "ivanov ivan ivanovich";

        char[] chars = fullName.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        chars[fullName.indexOf(' ')+1] = Character.toUpperCase(chars[fullName.indexOf(' ')+1]);
        chars[fullName.lastIndexOf(' ')+1] = Character.toUpperCase(chars[fullName.lastIndexOf(' ')+1]);

        String correctFullName = String.valueOf(chars);

        System.out.println("Correct spelling of the employee's full name in capital letters - " +
                correctFullName);
    }

    private static void task6() {
        String s1 = "135", s2 = "246";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i)).append(s2.charAt(i));
        }

        System.out.println("Data of string - " + sb);
    }

    private static void task7() {
        String s =  "aabccddefgghiijjkk";
        StringBuilder finalS = new StringBuilder();
        boolean firstEquals = true;

        for (int i = 1; i < s.length(); i++) {
            boolean isEquals = s.charAt(i) == s.charAt(i - 1);
            if (isEquals && firstEquals ) {
                finalS.append(s.charAt(i));
                firstEquals = false;
            } else if (!isEquals) {
                firstEquals = true;
            }
        }

        System.out.println(finalS);
    }
}
