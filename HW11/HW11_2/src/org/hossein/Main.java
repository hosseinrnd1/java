package org.hossein;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;



public class Main {
    public static void main (String[] args) throws Exception {
        Scanner scanner
                = new Scanner (System.in);
        String input1 = scanner.nextLine ();
        String input2 = scanner.nextLine ();
        String input3 = scanner.nextLine ();

        String request = String.format ("http://localhost:8081/rest/person/save?name=%s&address=%s&dateofestablished=%s", input1, input2, input3);
        URL url = new URL (request);
        URLConnection urlConnection = url.openConnection ();
        InputStream inputStream = urlConnection.getInputStream ();
        InputStreamReader inputStreamReader = new InputStreamReader (inputStream, "UTF-8");
        int ascii = inputStreamReader.read ();
        String content = "";
        while (ascii != -1) {
            content += (char) ascii;
            ascii = inputStreamReader.read ();
        }
        inputStreamReader.close ();
        JSONArray jsonArray = (JSONArray) new JSONParser ().parse (content);
        for (Object o : jsonArray) {
            JSONObject jsonObject = (JSONObject) o;
            System.out.println (jsonObject.get ("name"));
            System.out.println (jsonObject.get ("address"));
            System.out.println (jsonObject.get ("dateodestablished"));
        }
    }
}
