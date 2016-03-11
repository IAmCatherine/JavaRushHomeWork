package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;
import java.util.AbstractCollection;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        FileWriter file2 = new FileWriter(reader.readLine());
        ArrayList<Integer> chisla = new ArrayList<>();
        while (file1.ready()){
            String[] strings = file1.readLine().split(" ");
            for (String s : strings){
                try {
                   chisla.add(Integer.parseInt(s));
                }
                catch (Exception e){

            }
        }
    }
        for (int i = 0; i <chisla.size(); i++){
            file2.write(chisla.get(i)+"");
            if (i!=chisla.size()-1 ){
                file2.write(" ");
            }
        }
        file1.close();
        file2.close();
        reader.close();
}}
