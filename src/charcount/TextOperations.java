package charcount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextOperations {

    Map<Character, Integer> signs = new HashMap<Character, Integer>();

    String getFileText(File file) {
        String text = "";
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                text += sc.nextLine() + "\n";
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return text;
    }

    void countSigns(String text) {
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (signs.containsKey(character)) {
                signs.put(character, (signs.get(character) + 1));
            } else {
                signs.put(character, 1);
            }
        }
    }

    String writeCountedSigns() {
        String text = "";
        for (Character key : signs.keySet()) {
            text += (key + " - " + signs.get(key) + "\n");
        }
        
        return text;
    }

}
