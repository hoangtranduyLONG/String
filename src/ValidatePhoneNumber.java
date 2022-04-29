public class ValidatePhoneNumber {
    private static final String[] valid = {"(34)-(666888999)", "(42)-(333999666)"};
    private static final String[] invalid = {" (92)-(338222666)", "(54)-(999222444)"};

    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();

        for (String phoneNumber : valid) {
            boolean isValid  = ValidatePhoneNumber.isValidate(phoneNumber);
            System.out.println("Phone number: " + phoneNumber + " is valid: " +isValid);
        }
        for (String phoneNumber : invalid) {
            boolean isValid = ValidatePhoneNumber.isValidate(phoneNumber);
            System.out.println("Phone number: " + phoneNumber + " is valid: " + isValid);
        }
    }

    private static boolean isValidate(String phoneNumber) {
        return false;
    }
}
