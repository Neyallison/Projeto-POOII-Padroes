/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padroes;

/**
 *
 * @author Ney Allison
 */
import java.util.regex.*;

public class Adapter {
    public static String convert(String xml) {
        xml = xml.replaceAll("<\\?xml.*?\\?>", ""); 
        Matcher matcher = Pattern.compile("<(\\w+)>(.*?)</\\1>").matcher(xml);

        StringBuilder json = new StringBuilder();
        json.append("{\n");

        while (matcher.find()) {
            json.append("  \"").append(matcher.group(1)).append("\": \"")
                .append(matcher.group(2)).append("\",\n");
        }

        if (json.length() > 2) json.deleteCharAt(json.length() - 2);
        json.append("}");
        return json.toString();
    }
}
