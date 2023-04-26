package Codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ValidateHello {
    public static void main(String[] args) {

        System.out.println(validateHello("ciao bella!"));
        System.out.println(validateHello("AHOJ!"));
        System.out.println(validateHello("hombre! Hola!"));

    }

    public static boolean validateHello(String greetings) {

        List<String> hellos = Arrays.asList("hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc");

        for (int i = 0; i < hellos.size(); i++) {
            if (greetings.toLowerCase().contains(hellos.get(i))) {
                return true;
            }
        }

        return false;
    }

    @Test
    void testSomething() {
        Assertions.assertTrue(validateHello("hello"));
        Assertions.assertTrue(validateHello("ciao bella!"));
        Assertions.assertTrue(validateHello("salut"));
        Assertions.assertTrue(validateHello("hallo, salut"));
        Assertions.assertTrue(validateHello("hombre! Hola!"));
        Assertions.assertTrue(validateHello("Hallo, wie geht\'s dir?"));
        Assertions.assertTrue(validateHello("AHOJ!"));
        Assertions.assertTrue(validateHello("czesc"));
        Assertions.assertTrue(validateHello("Ahoj"));
        Assertions.assertFalse(validateHello("meh"));
    }
}
