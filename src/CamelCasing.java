public class CamelCasing {

    public static void main(String[] args) {

        String input1 = "the-stealth-warrior";
        String input2 = "The_stealth_warrior";

        System.out.println(camelCase(input1)); // theStealthWarrior
        System.out.println(camelCase2(input2)); // TheStealthWarrior
    }

    private static String camelCase(String input) {

        String[] words = input.split("[-_]");

        String result = words[0];

        for (int i = 1; i < words.length; i++) {
            result += words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }

        return result;

    }

    private static String camelCase2(String str) {

        String camelCaseStr = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != '-' && str.charAt(i) != '_') {
                camelCaseStr += str.charAt(i);
            } else {
                i++;
                camelCaseStr += Character.toUpperCase(str.charAt(i));
            }
        }
        return camelCaseStr;
    }
}
