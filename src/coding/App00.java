package coding;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by v.pelenskyi on 07.10.2015.
 */
public class App00 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = new String(new byte[]{1, 0, 8, 2, 4});  //Строку можна побудувати з байт
        byte[] raw = str.getBytes("UTF-8"); //Строку можна розбити на масив байт  в кодуванні UTF-8
        byte[] raw2 = str.getBytes("ASCII"); //Строку можна розбити на масив байт в кодуванні ASCII

//==============================================================

        // перетворємо строку в масив байт
        byte[] myRaw = "Valera".getBytes();
        // виводимо масив байт
        System.out.println(Arrays.toString(myRaw));
        // із масива байт формуємо строку
        String myStr = new String(myRaw);
        // виводимо строку в яка була сформована з масиву байт
        System.out.println(myStr);

        System.out.println("A".getBytes("UTF-16").length);
        System.out.println("AA".getBytes("UTF-16").length);




    }
}
