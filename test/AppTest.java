import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void givenEmptyArrayReturnsEmptyArray(){
        String [] emptyArray = {};
        String emptyString = "";
        System.out.println(App.getShortestUniqueString(emptyArray, emptyString).length());
        Assertions.assertTrue(App.getShortestUniqueString(emptyArray, emptyString).length()==0);
    }
    @Test
    public void givenAnArrayReturnAString() {
        String [] array = {"x"};
        String string = "x";
        Assertions.assertEquals("x", App.getShortestUniqueString(array, string));
    }
    @Test
    public void givenACharacterOfArraysReturnsAShortestString() {
        String [] array = {"x","y","z"};
        String string = "x9090909y";
        Assertions.assertEquals("xy", App.getShortestUniqueString(array, string));
    }
    @Test
    public void givenACharacterOfArraysReturnsAShortestStringWhichDoesNotHaveRepeatingCharacters() {
        String [] array = {"x","y","z"};
        String string = "xx090909y";
        Assertions.assertEquals("xy", App.getShortestUniqueString(array, string));
    }

    @Test
    public void givenMoreThan30CharacterArrayReturnsEmptyString() {
        String [] array = {"x","y","z","x","y","z","x",
                "x","y","z","x","y","z",
                "x","y","z","x","y","z",
                "x","y","z","x","y","z",
                "x","y","z","x","y","z",};
        String string = "xx090909y";
        Assertions.assertEquals("", App.getShortestUniqueString(array, string));
    }

    @Test
    public void givenMoreThan500CharacterStringReturnsEmptyString() {
        String [] array = {"x","y","z","x","y","z","x"};
        String string = "xx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909y" +
                "xx090909yxx090909yxx090909yxx090909yxx090909y";
        Assertions.assertEquals("", App.getShortestUniqueString(array, string));
    }

    @Test
    public void givenACharacterOfArraysReturnsAShortestStringWhichDoesNotHaveRepeatingCharacters2() {
        String [] array = {"x","y","z","9","0"};
        String string = "zxx090909y";
        Assertions.assertEquals("xyz90", App.getShortestUniqueString(array, string));
    }

}
