package curso.javaio;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {
    public static void main(String[] args) {
        String s = "C";
        System.out.println(s.codePointAt(0));

        Charset cs = Charset.defaultCharset();
        System.out.println(cs.displayName());

        byte[] b = s.getBytes();
        System.out.println(b.length + " - windows-1252" );

        try {
            byte[] b2 = s.getBytes("utf-8");
            System.out.println(b2.length + " - UTF8");

            byte[] b3 = s.getBytes(StandardCharsets.UTF_16);
            System.out.println(b3.length + " - UTF16");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
