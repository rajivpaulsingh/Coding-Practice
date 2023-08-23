package Fanatics;

import java.util.regex.Pattern;

public class AddressValidator {

    private static final String ZIP_CODE_REGEX = "\\d{5}(-\\d{4})?";
    private static final String PHONE_NUMBER_REGEX = "\\d{3}-\\d{3}-\\d{4}";
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    public static boolean validateZipCode(String zipCode) {
        return zipCode.matches(ZIP_CODE_REGEX);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches(PHONE_NUMBER_REGEX);
    }

    public static boolean validateEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public static void main(String[] args) {
        String zipCode = "12345-6789";
        String phoneNumber = "123-456-7890";
        String email = "test@example.com";

        boolean isZipCodeValid = validateZipCode(zipCode);
        boolean isPhoneNumberValid = validatePhoneNumber(phoneNumber);
        boolean isEmailValid = validateEmail(email);

        System.out.println("Zip Code Validation: " + isZipCodeValid);
        System.out.println("Phone Number Validation: " + isPhoneNumberValid);
        System.out.println("Email Validation: " + isEmailValid);
    }
}
