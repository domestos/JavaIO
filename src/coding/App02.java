package coding;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by v.pelenskyi on 08.10.2015.
 */
public class App02 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        byte [] bytes = {70,71,72};

        String str  = new String(bytes,"UTF-8");
        System.out.println(str);
        char[] chars  = str.toCharArray();
        System.out.println(chars);


        // System.out.println(); - маЇ дек≥лька Overloading метод≥в, тому по р≥зному виводить результат
        System.out.println(chars[0]);
        System.out.println(chars[1] + 0);
        System.out.println((int) chars[2]);

        // ќдн byte[] може збер≥гати збер≥гати р≥зну к≥льк≥сть елемент≥в char[]
        bytes = new byte[]{100, -101, 70};
        System.out.println(Arrays.toString(new String(bytes, "UTF-8").toCharArray()));
        System.out.println(Arrays.toString(new String(bytes, "cp1251").toCharArray()));
        System.out.println(Arrays.toString(new String(bytes, "UTF-16").toCharArray()));

        // ус≥ три записи р≥вн≥
        String str0 = "\u0040\u0040"; //unicod
        System.out.println(str0);

        String str1 = new String(new char[] {64, 64}); //Dec (10)
        System.out.println(str1);

        String str2 = new String(new char[] {0x40, 0x40}); //Hex (16)
        System.out.println(str2);






    }
}
