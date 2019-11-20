package edu.cscc;

import java.io.File;
import java.util.Set;

/**
 * @author musabfiqi
 * @version 1.0
 * 2019-11-19
 * Prints Unique words in alphabetical order from the book called
 * "At the mountains of Madness"
 */
public class Main {
    private static final String fname = "AtTheMountainsOfMadness_HP_Lovecraft.txt";

    public static void main(String[] args) {
        File myfile = new File(fname);
        Set<String> uniques = UniqueWords.processDocument(myfile);
        for (String s : uniques) {
            System.out.println(s);
        }
        System.out.println("Got "+uniques.size()+" words");
    }
}
