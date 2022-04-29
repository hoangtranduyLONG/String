
public class ValidateClass {

        private static final String[] valid = {"I0122g", "Q3182K", "C1222G"};
        private static final String[] invalid = {"E3142M", " B0128M", "Q9245J"};

        public static void main (String[]args){
            ValidateClass validateClassName = new ValidateClass();
            for (String name : valid) {
                boolean isValid = ValidateClass.isValidate(name);
                System.out.println("Class name: " + name + " is valid: " + isValid);
            }
            for (String name : invalid) {
                boolean isValid = ValidateClass.isValidate(name);
                System.out.println("Class name: " + name + " is valid: " + isValid);
            }
        }

    private static boolean isValidate(String name) {
        return false;
    }
}

