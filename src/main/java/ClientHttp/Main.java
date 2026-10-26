package ClientHttp;

import java.io.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.net.URI;

public class Main {
    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://example.com")).GET().build();
        CompletableFuture<HttpResponse<String>> future = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .orTimeout(30,TimeUnit.SECONDS);
        HttpResponse<String> response = future.join();
        if(response.statusCode() >= 200 && response.statusCode() < 300)
            System.out.println(response.body());
        else System.out.println(response.statusCode());

        String result = response.body().toString().replace(">",">\n");
        result = result.replace("}","}\n");
        System.out.println(result);

        try(
                BufferedOutputStream buff = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Nikita\\Desktop\\output.txt"));
                ){

            buff.write(result.getBytes(StandardCharsets.UTF_8));


        }catch (FileNotFoundException e){
            System.out.println("Не удалось открыть файл! Error: " + e.getMessage());
        }
        catch (IOException e){
            System.out.println("Не удалось записать в файл данные! Error: " + e.getMessage());
        }

    }
}
