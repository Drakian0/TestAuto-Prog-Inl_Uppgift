import java.util.HashMap;

public class Translator {

    private HashMap<String, String> textToMorseMap;
    private HashMap<String, String> morseToTextMap;

    public Translator(){
        textToMorseMap = new HashMap<>();
        morseToTextMap = new HashMap<>();
        initializeMaps();
    }

    private void initializeMaps(){
        String[] morseCodeArray = {
            "*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---",
            "-*-", "*-**", "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-",
            "**-", "***-", "*--", "-**-", "-*--", "--**", "*----", "**---",
            "***--", "****-", "*****", "-****", "--***", "---**", "----*", "-----",
            "*-*-*-", "--**--", "**--**"
        };

        String[] alphabetArray = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?"
        };

        for (int i = 0; i < alphabetArray.length; i++) {
            textToMorseMap.put(alphabetArray[i], morseCodeArray[i]);
            morseToTextMap.put(morseCodeArray[i], alphabetArray[i]);
        }
    }

    public String convert(String input, boolean morse){
        String result = "";
        String[] split;

        if(morse){
            split = input.split(" ");
    
            for (int i = 0; i < split.length; i++) {
                String currentCode = split[i];
    
                if (currentCode.equals(" ") || currentCode.equals("/"))
                    result += " ";
                else if(currentCode.matches("[^*-]"))
                    result += "";
                else
                    result += morseToTextMap.get(currentCode);
            }
        }
        else{
            input = input.toLowerCase();
            split = input.split("");
    
            for (int i = 0; i < split.length; i++) {
                String currentLetter = split[i];
                if (currentLetter.equals(" "))
                    result += "/ ";
                else if (i == split.length - 1)
                    result += textToMorseMap.get(currentLetter);
                else{
                    result += textToMorseMap.get(currentLetter);
                    result += " ";
                }
            }
        }
        return result;
    }
    
}
