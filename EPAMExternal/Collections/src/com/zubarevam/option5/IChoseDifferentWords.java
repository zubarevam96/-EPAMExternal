package com.zubarevam.option5;

import com.zubarevam.Option;

import java.io.IOException;
import java.util.List;

public interface IChoseDifferentWords extends Option {
    List<String> execute() throws IOException;
}
//Задан файл с текстом на английском языке. Выделить все
//различные слова. Слова, отличающиеся только регистром букв,
//считать одинаковыми. Использовать класс HashSet.