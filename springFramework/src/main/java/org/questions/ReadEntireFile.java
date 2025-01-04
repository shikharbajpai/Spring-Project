package org.questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadEntireFile {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("book.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> list;
        Stream<String> stream = bufferedReader.lines();
        System.out.println(stream);
        list = stream.collect(Collectors.toList());
        System.out.println("Entire file......");
        list.forEach(System.out::println);

        System.out.println("Entire first 3 lines......");
        System.out.println(list.stream());
        list.stream().limit(3).forEach(System.out::println);

        bufferedReader.close();

    }
}
