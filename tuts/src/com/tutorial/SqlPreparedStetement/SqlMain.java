package com.tutorial.SqlPreparedStetement;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SqlMain {
    public static void main(String[] args) {
//        PreparedStatement statement = new PreparedStatement();
//        statement.sql();
        ArrayList<String> result = new ArrayList<>();

        try (FileReader f = new FileReader("append.txt")) {
            StringBuffer sb = new StringBuffer();
            while (f.ready()) {
                char c = (char) f.read();
                if (c == '\n') {
                    result.add(sb.toString());
                    sb = new StringBuffer();
                } else {
                    sb.append(c);
                }
            }
            if (sb.length() > 0) {
                result.add(sb.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
