class EMailChecker {
    public static void main(String[] args) {
        String adrs = "martin.doeb@datacamp.com";
        int addLen = adrs.length();
        boolean hasAt = adrs.contains("@");

        if (hasAt && adrs.charAt(addLen - 4) == '.') {
            System.out.println("Send that email !");
            // Enter the correct logical operator to be able to catch all correct emails
        } else if (hasAt && (adrs.charAt(addLen - 3) == '.' || hasDotAfterAt(adrs))) {
            System.out.println("That's a correct email address");
            // Use the correct keyword to catch any bad email addresses
        } else {
            // Make sure that the users know when the '@' is missing
            if (!hasAt) {
                System.out.println("Your email is missing the '@'");
            } else {
                System.out.println("That's not a valid email");
            }
        }
    }

    static boolean hasDotAfterAt(String address) {
        int atPos = address.indexOf('@');
        String subString = address.substring(atPos);
        return subString.contains(".");
    }
}