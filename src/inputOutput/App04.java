package inputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Arrays;

/**
 * Created by v.pelenskyi on 13.10.2015.
 */
public class App04 {
    public static void main(String[] args) throws IOException {
        InputStream src = new URL("http://zem-lviv.gov.ua").openStream();
        OutputStream dst = new FileOutputStream("c:/methosCopy.txt");
        copy(src, dst);
    }

    //в методі створюється буфер великої ємності куди записується
    private static void copy(InputStream src, OutputStream dst) throws IOException {

        byte[] buff = new byte[1024*64];  // 64Kb - 65536 масив байт (char = 16 bit -  діапазов чисел від 0 до 65536 (2^16))
        while (true){
            //читає з вхідного потоку та записує в масив buff.
            // Повертає кількість байтів, насправді прочитаних з потоку;
            int count = src.read(buff);

            //намагається прочитати максимум len (10) байтів, розташувавши їх в масиві buff, починаючи з елемента off(0).
            // Повертає кількість реально прочитаних байтів;
            int count1 = src.read(buff,0,10);

            if(count != -1){
                System.out.println("count : "+count);
                System.out.println(Arrays.toString(buff));
                dst.write(buff, 0 , count); // передаємо масив (буфер байт) і вказуємо писати від 0 до count
            }else{
                String  str = " *** END METHOD COPY ***";
                byte[] b = str.getBytes();
                dst.write(b);
                return;
            }

        }



    }

}
