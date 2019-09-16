package com.zubarevam.option1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReadAndWrite implements IReadAndWrite {

    @Override
    public void execute() {
        try {
            write(read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> read() throws IOException {
        String inputPath = "src\\com\\zubarevam\\option1\\inputFile.txt";
        List<String> result = new ArrayList<>();

            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(inputPath)));
            String line;
            while ((line = in.readLine()) != null) {
                result.add(line);
            }

        return result;
    }

    private void write(List<String> list) throws IOException {
        String outputPath = "src\\com\\zubarevam\\option1\\outputFile.txt";

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputPath)));
            ListIterator li = list.listIterator(list.size());
            while (li.hasPrevious()) {
                out.write( li.previous() + "\n");
            }
            out.close();

    }
}
//Ввести строки из файла, записать в список. Вывести строки в файл
//в обратном порядке.