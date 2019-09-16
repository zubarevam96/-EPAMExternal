package com.zubarevam.option2;

import com.zubarevam.Option;

import java.io.IOException;
import java.util.ArrayList;

public interface ICreateCatalogList extends Option {
    ArrayList<String> execute() throws IOException;
}
//Создать список из элементов каталога и его подкаталогов.