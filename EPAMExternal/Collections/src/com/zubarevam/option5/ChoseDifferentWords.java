package com.zubarevam.option5;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ChoseDifferentWords implements IChoseDifferentWords {
    @Override
    public List<String> execute() throws IOException {
        HashSet<String> hashSet = new HashSet<>();
        List<String> inputStrings = getStringsFromFile();
        List<String> result = new ArrayList<>();
        for (String tmp : inputStrings) {
            if (!hashSet.contains(tmp.toLowerCase())) {
                result.add(tmp);
                hashSet.add(tmp.toLowerCase());
            }
        }
        return result;
    }
    private List<String> getStringsFromFile() throws IOException {
        String inputPath = "src\\com\\zubarevam\\option5\\inputFile.txt";
        List<String> result = new ArrayList<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(inputPath)));
        String line;
        while ((line = in.readLine()) != null) {
            result.addAll(Arrays.asList
                    (line.replaceAll("[,.:!&?;\"*@]","").split(" ")));
        }
        return result;
    }
}
