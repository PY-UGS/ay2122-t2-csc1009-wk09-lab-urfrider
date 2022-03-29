import java.util.Random;

public class RandomCharacter {

    public static void main(String[] args){
        String lowerCase = " ";
        String upperCase = " ";
        String digits = " ";
        String randomChar = " ";
        // loop 15 times to get each respective random characters
        for (int i = 0; i < 15; i++){
            lowerCase += getRandomLowerCaseLetter();
            upperCase += getRandomUpperCaseLetter();
            digits += getRandomDigitCharacter();
            randomChar += getRandomCharacter();
        }

        System.out.println("15 random lower case letters are : " + lowerCase);
        System.out.println("15 random upper case letters are : " + upperCase);
        System.out.println("15 random digits are : " + digits);
        System.out.println("15 random characters are : " + randomChar);

        char lowerCase2 = getRandomLowerCaseLetter();;
        char upperCase2 = getRandomUpperCaseLetter();
        char digits2 = getRandomDigitCharacter();
        char randomChar2 = getRandomCharacter();

        System.out.println("The random lower case letter is : " + lowerCase2 + ", the ASCII value of the letter is : " + (int)lowerCase2 + ", is this a prime number: " + isPrime(lowerCase2));
        System.out.println("The random upper case letter is : " + upperCase2 + ", the ASCII value of the letter is : " + (int)upperCase2 + ", is this a prime number: " + isPrime(upperCase2));
        System.out.println("The random digit is : " + digits2 + ", the ASCII value of the letter is : " + (int)digits2 + ", is this a prime number: " + isPrime(digits2));
        System.out.println("The random character is : " + randomChar2 + ", the ASCII value of the letter is : " + (int)randomChar2 + ", is this a prime number: " + isPrime(randomChar2));
    }
    // this function returns random lower case letter
    public static char getRandomLowerCaseLetter(){
        Random ran = new Random();
        // alphabet has only 26 characters
        int randNum = ran.nextInt(26);
        // add offset of 97 for ASCII value of lower case letters
        char randChar = (char) (randNum + 97);
        return randChar;
    }
    // this function returns random upper case letter
    public static char getRandomUpperCaseLetter(){
        Random ran = new Random();
        // alphabet has only 26 characters
        int randNum = ran.nextInt(26);
        // add offset of 65 for ASCII value of lower case letters
        char randChar = (char) (randNum + 65);
        return randChar;
    }
    // this function returns random digit character
    public static char getRandomDigitCharacter(){
        Random ran = new Random();
        // there are total of 10 digits, 1-10
        int randNum = ran.nextInt(10);
        // add offset of 48 for ASCII value of digits
        char randChar = (char) (randNum + 48);
        return randChar;
    }
    // this function returns any random characters or digit
    public static char getRandomCharacter(){
        char randChar = ' ';
        Random ran = new Random();
        int randNum = ran.nextInt(3);
        switch (randNum){
            // get a random lower case letter
            case 0:
                randChar = getRandomLowerCaseLetter();
                break;
            // get a random upper case letter
            case 1:
                randChar = getRandomUpperCaseLetter();
                break;
            // get a random digit
            case 2:
                randChar = getRandomDigitCharacter();
                break;
        }
        return randChar;
    }
    // this function checks if the value is a prime number
    public static boolean isPrime(int num){
        // 1 is not a prime
        if (num <= 1){
            return false;
        }
        // if the number is divisible by any value excluding itself, it is not a prime
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

}
