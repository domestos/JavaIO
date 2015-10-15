package coding;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Calendar;

/**
 * Created by v.pelenskyi on 07.10.2015.
 */
public class App01  {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // char = 16 bit -  діапазов чисел від 0 до 65536 (2^16)
        char ch = 65;
        // 65 - відповідає за Букву А - це означає, що кожна буква має своє число
        System.out.println(ch);

        byte[] raw8 = String.valueOf(ch).getBytes("UTF-8");
        System.out.println(Arrays.toString(raw8));

        byte[] raw16 = String.valueOf(ch).getBytes("UTF-16");
        System.out.println(Arrays.toString(raw16));

        byte[] rawASCII = String.valueOf(ch).getBytes("ASCII");
        System.out.println(Arrays.toString(rawASCII));






    }
}
