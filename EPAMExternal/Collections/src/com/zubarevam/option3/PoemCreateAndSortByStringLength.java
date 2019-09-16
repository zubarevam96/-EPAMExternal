package com.zubarevam.option3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PoemCreateAndSortByStringLength implements IPoemCreateAndSortByStringLength {
    Comparator<String> stringLengthComparator = new StringLengthComparator();
    @Override
    public List<String> execute(String s) {
        List<String> poem = new ArrayList<>(Arrays.asList(s.split("\n")));
        poem.sort(stringLengthComparator);
        return poem;
    }
}
