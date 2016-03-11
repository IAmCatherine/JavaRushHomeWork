package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file =new BufferedReader( new FileReader(reader.readLine()));
        int count=0;
        while (file.ready()){
            String[] string = file.readLine().split("\\p{Punct}");
            for (int i=0; i < string.length; i++){
                String[] stroka= string[i].split(" ");
                for (int j=0; j < stroka.length; j++){
                    if (stroka[j].equals("world")){count++;}
                }
            }
        }
        System.out.println(count);
        file.close();
        reader.close();

    }
}
