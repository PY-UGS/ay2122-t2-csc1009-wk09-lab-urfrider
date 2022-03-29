import org.junit.Before;
import org.junit.jupiter.api.DisplayName;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class RandomCharacterTest {
    RandomCharacter randomCharacter;
    Pattern pattern;

    @Before
    public void setup(){
        randomCharacter = new RandomCharacter();
    }

    @DisplayName("Returns a random lower case letter")
    @org.junit.jupiter.api.Test
    public void getRandomLowerCaseLetter() {
        assertTrue(pattern.matches("\\p{javaLowerCase}",Character.toString(randomCharacter.getRandomLowerCaseLetter())));
    }

    @DisplayName("Returns a random upper case letter")
    @org.junit.jupiter.api.Test
    void getRandomUpperCaseLetter() {
        assertTrue(pattern.matches("\\p{javaUpperCase}",Character.toString(randomCharacter.getRandomUpperCaseLetter())));
    }

    @DisplayName("Returns a random digit")
    @org.junit.jupiter.api.Test
    void getRandomDigitCharacter() {
        assertTrue(pattern.matches("\\d",Character.toString(randomCharacter.getRandomDigitCharacter())));

    }

    @DisplayName("Returns a random character")
    @org.junit.jupiter.api.Test
    void getRandomCharacter() {
        assertTrue(pattern.matches("\\w",Character.toString(randomCharacter.getRandomCharacter())));
    }

    @DisplayName("Validate a prime number")
    @org.junit.jupiter.api.Test
    void isPrime() {
        // declare prime numbers from 2 to 101 as ASCII value is used for calculation
        int[] array = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for (int i = 0; i < array.length; i++){
            assertTrue(randomCharacter.isPrime(array[i]) == true);
        }
    }

}