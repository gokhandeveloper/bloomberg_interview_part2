import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String args[]) {

    }
    public static String getShortestUniqueString(String[] array, String string) {
        String x = checkLengths(array, string);
        if (x != null) return x;
        if (array.length >= 1 && string.length()>=1) {
            List<String> foundStrings = findStringsInArray(array, string);
            return concatinateFoundStrings(foundStrings);
        }
        return "";
    }
    
    private static List<String> findStringsInArray(String[] array, String string) {
        List<String> foundStrings = new ArrayList<>();
        for (String stringInArray : array) {
            List<String> splittedStrings = Arrays.asList(string.split(""));
            for(String splittedString : removeDuplicates(splittedStrings)) {
                if(splittedString.equals(stringInArray)) {
                    foundStrings.add(splittedString);
                }
            }
        }
        return foundStrings;
    }

    private static String concatinateFoundStrings(List<String> foundStrings) {
        String returnedString = "";
        for (int i = 0; i< foundStrings.size(); i++) {
            returnedString = returnedString.concat(foundStrings.get(i));
        }
        return returnedString;
    }

    private static String checkLengths(String[] array, String string) {
        if(array.length > 30 || string.length()>500) {
            return "";
        }
        return null;
    }

    public static List<String> removeDuplicates(List<String> list) {
        List<String>  newList = new ArrayList<>();
        for (String element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
}
