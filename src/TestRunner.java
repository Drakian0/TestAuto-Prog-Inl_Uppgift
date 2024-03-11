import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRunner {

    @Test
    public void testAToMorse(){
        Translator translator = new Translator();

        String testData = "A";
        String expected = "*-";
        String actual = translator.convert(testData, false);

        assertEquals(expected, actual);
    }
    
    @Test
    public void testMorseToA(){
        Translator translator = new Translator();

        String testData = "*-";
        String expected = "a";
        String actual = translator.convert(testData, true);

        assertEquals(expected, actual);
    }
    
    @Test
    public void testWordToMorse(){
        Translator translator = new Translator();

        String testData = "WORD";
        String expected = "*-- --- *-* -**";
        String actual = translator.convert(testData, false);

        assertEquals(expected, actual);
    }

    @Test
    public void testSentenceToMorse(){
        Translator translator = new Translator();

        String testData = "word of the day";
        String expected = "*-- --- *-* -** / --- **-* / - **** * / -** *- -*--";
        String actual = translator.convert(testData, false);

        assertEquals(expected, actual);
    }

    @Test
    public void testMorseToSentence(){
        Translator translator = new Translator();

        String testData = "*-- --- *-* -** / --- **-* / - **** * / -** *- -*--";
        String expected = "word of the day";
        String actual = translator.convert(testData, true);

        assertEquals(expected, actual);
    }

    @Test
    public void testSpaceToMorse(){
        Translator translator = new Translator();

        String testData = " ";
        String expected = "/ ";
        String actual = translator.convert(testData, false);

        assertEquals(expected, actual);
    }
    
    @Test
    public void testMorseToWord(){
        Translator translator = new Translator();

        String testData = "*-- --- *-* -**";
        String expected = "word";
        String actual = translator.convert(testData, true);

        assertEquals(expected, actual);
    }

    @Test
    public void testDot(){
        Translator translator = new Translator();

        String testData = ".";
        String expected = "*-*-*-";
        String actual = translator.convert(testData, false);

        assertEquals(expected, actual);
    }

    @Test
    public void testQuestionMark(){
        Translator translator = new Translator();

        String testData = "?";
        String expected = "**--**";
        String actual = translator.convert(testData,false);

        assertEquals(expected, actual);
    }

    @Test
    public void testComma(){
        Translator translator = new Translator();

        String testData = ",";
        String expected = "--**--";
        String actual = translator.convert(testData, false);

        assertEquals(expected, actual);
    }

    @Test
    public void testIncorrectText(){
        Translator translator = new Translator();

        String testData = "*- @";
        String expected = "a";
        String actual = translator.convert(testData, true);

        assertEquals(expected, actual);
    }
}
