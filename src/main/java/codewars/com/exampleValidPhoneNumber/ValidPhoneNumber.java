package codewars.com.exampleValidPhoneNumber;

/**
 * Kata
 * <p>
 * Write a function that accepts a string, and returns true if it is in the form of a phone number.
 * Assume that any integer from 0-9 in any of the spots will produce a valid phone number.
 * Only worry about the following format:
 * <p>
 * (123) 456-7890 (don't forget the space after the close parentheses)
 * <p>
 * Examples:
 * validPhoneNumber("(123) 456-7890")  =>  returns true
 * validPhoneNumber("(1111)555 2345")  => returns false
 * validPhoneNumber("(098) 123 4567")  => returns false
 */
public class ValidPhoneNumber {

    /**
     * Regex: \\([0-9]{3}\)  -> 3 numeros en parentesis.
     * Regex: [0-9]{3}       -> 3 numeros.
     * Regex: [0-9]{3}       -> 4 numeros.
     */
    private static final String PHONE_REGEX = "\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}";

    /**
     * Constructor.
     */
    ValidPhoneNumber() {

    }

    /**
     * @param phoneNumber phoneNumber.
     * @return boolean.
     */
    public boolean validPhoneNumber(final String phoneNumber) {
        return phoneNumber.matches(PHONE_REGEX);
    }
}
