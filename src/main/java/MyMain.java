public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if(ch <= 'Z' && ch >= 'A') return (char) (ch+32);
        return ch;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        if(ch <= 'z' && ch >= 'a') return (char) (ch-32);
        return ch;
    }

    public static boolean isNumber(char c) {
        return(c >= '0' && c <= '9');
    }



    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        String res = "";
        char ch;
        for(int i=0; i<str.length(); i++) {
            ch = str.charAt(i);
            if(!(isNumber(ch))) res += ch;
        }
        return res;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        // ADD SOME TESTING CODE HERE
    }
}
