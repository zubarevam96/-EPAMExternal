package com.zubarevam.option3;

import com.zubarevam.Option;

import java.util.ArrayList;
import java.util.List;

public interface IPoemCreateAndSortByStringLength extends Option {
    List<String> execute(String s);

}
//Занести стихотворение в список. Провести сортировку по
//возрастанию длин строк.