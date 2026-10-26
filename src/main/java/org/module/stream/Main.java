package org.module.stream;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        File imageInput = new File("C:\\Users\\Nikita\\Desktop\\Screenshot.png");
        File imageOutput = new File("C:\\Users\\Nikita\\Desktop\\Screenshot2.png");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(imageInput));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(imageOutput));
        int n;
        while((n = bufferedInputStream.read()) != -1){
            bufferedOutputStream.write(n);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
