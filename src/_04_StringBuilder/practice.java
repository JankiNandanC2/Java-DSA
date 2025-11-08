package _04_StringBuilder;

public class practice {
    static void main() {
        char ch ='j';
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.toTitleCase(ch));
        ch = Character.toUpperCase(ch);
        System.out.println(Character.isUpperCase(ch));
        System.out.println(String.valueOf(ch)); // returns the value of ch

    }
}
