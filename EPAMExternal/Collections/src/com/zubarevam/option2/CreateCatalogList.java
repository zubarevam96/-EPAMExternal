
package com.zubarevam.option2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CreateCatalogList implements ICreateCatalogList {
    ArrayList<File> arr = new ArrayList<>();

    @Override
    public ArrayList<String> execute() throws IOException {
        File file = new File("src\\com\\zubarevam");
        execute(file);
        ArrayList<String> result = new ArrayList<>();
        for (File f : arr) {
            result.add(f.getName());
        }
        return result;
    }

    private void execute(File f) throws IOException {
        File[] files = f.listFiles();
        assert files != null;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                execute(files[i]);
            } else if (files[i].isFile()) {
                arr.add(files[i]);
            }
        }
    }
}
