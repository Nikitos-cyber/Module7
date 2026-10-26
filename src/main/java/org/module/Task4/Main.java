package org.module.Task4;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;


public class Main {
    public static void main(String[] args)  {

        try {
            copyFileUsingStream("src/utf8.txt", "UTF-8", "src/windows1251.txt", "WINDOWS-1251");
            System.out.println("Успешно!!!");
        } catch (ConvertException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void copyFileUsingStream(String source, String sourceEnc, String target, String targetEnc) throws ConvertException {
        try (
                Reader read = new InputStreamReader(new FileInputStream(source), Charset.forName(sourceEnc));
                Writer writer = new OutputStreamWriter(new FileOutputStream(target), Charset.forName(targetEnc))
        ) {


            char[] buffer = new char[5];
            int length = 0;
            while ((length = read.read(buffer)) != -1) {
                writer.write(buffer, 0, length);
            }


        } catch (FileNotFoundException e) {
            throw new ConvertException("Ошибка файла: " + e.getMessage());
        } catch (UnsupportedCharsetException e) {
            throw new ConvertException("Ошибка кодировки: " + e.getMessage());
        } catch (IOException e) {
            throw new ConvertException("Ошибка копирования: " + e.getMessage());
        }

    }

}

class ConvertException extends Exception {
    public ConvertException(String message) {
        super(message);
    }
}


class A{
    public void f ()throws IOException{}
}



