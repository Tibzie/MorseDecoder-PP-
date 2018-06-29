public class Morse {

    public static void decode(String code) {
        // splits the code into words
        String[] words = code.split("/ ");
        // translates the letters in each word
        for (String word: words) {
            wording(word);
            System.out.print(" ");
        }
    }
    // splits words into letters and translates
    public static void wording(String word) {
        String[] letters = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters = word.split(" ");
        }
        for (String letter : letters) {
            String translatedLetter;
            switch (letter) {
                case (".-"):
                    translatedLetter = "A";
                    break;
                case ("-..."):
                    translatedLetter = "B";
                    break;
                case ("-.-."):
                    translatedLetter = "C";
                    break;
                case ("-.."):
                    translatedLetter = "D";
                    break;
                case ("."):
                    translatedLetter = "E";
                    break;
                case ("..-."):
                    translatedLetter = "F";
                    break;
                case ("--."):
                    translatedLetter = "G";
                    break;
                case ("...."):
                    translatedLetter = "H";
                    break;
                case (".."):
                    translatedLetter = "I";
                    break;
                case (".---"):
                    translatedLetter = "J";
                    break;
                case ("-.-"):
                    translatedLetter = "K";
                    break;
                case (".-.."):
                    translatedLetter = "L";
                    break;
                case ("--"):
                    translatedLetter = "M";
                    break;
                case ("-."):
                    translatedLetter = "N";
                    break;
                case ("---"):
                    translatedLetter = "O";
                    break;
                case (".--."):
                    translatedLetter = "P";
                    break;
                case ("--.-"):
                    translatedLetter = "Q";
                    break;
                case (".-."):
                    translatedLetter = "R";
                    break;
                case ("..."):
                    translatedLetter = "S";
                    break;
                case ("-"):
                    translatedLetter = "T";
                    break;
                case ("..-"):
                    translatedLetter = "U";
                    break;
                case ("...-"):
                    translatedLetter = "V";
                    break;
                case (".--"):
                    translatedLetter = "W";
                    break;
                case ("-..-"):
                    translatedLetter = "X";
                    break;
                case ("-.--"):
                    translatedLetter = "Y";
                    break;
                case ("--.."):
                    translatedLetter = "Z";
                    break;
                case (".----."):
                    translatedLetter = "\'";
                    break;
                case (".-..-."):
                    translatedLetter = "\"";
                    break;
                default:
                    translatedLetter = "#";
                    break;

            }
            System.out.print(translatedLetter);
            }
    }
    // replacing "FUNKY" dots and dashes with normal dots and dashes
    public static String cleanInput(String code) {
        try {
            if (code.matches(".*[\\d\\w]+.*")) {
                throw new Error();
            }
            // if something goes wrong, it will throw an error message and exit the program
        } catch (Error e) {
            System.out.print("Use only dots and dashes in your morse code.");
            System.exit(0);
        }
        String cleanedCode = code.replaceAll("[Â·,]+", ".");
        cleanedCode = cleanedCode.replaceAll("[â€’â€“â€”â€•]+", "-");
        return cleanedCode;
    }
    // declaring a morse variable which holds a morse code value. Additionally, it will output the decoded code.
    public static void main(String[] args) {
        String morse = "-.-- --- ..- / --. ..- -.-- ... / .- .-. . / â€“-. .-. . .- - / .- - / .--- .- ...- .- / --- -- --. / -.-- --- ..- Â·----Â· .-. . / ... --- / -.-. --- --- .-..";
        Morse.decode(cleanInput(morse));
    }



}
