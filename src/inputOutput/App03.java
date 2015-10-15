package inputOutput;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class App03  {

    public static void main(String[] args) throws IOException {

        InputStream src = new URL("http://zem-lviv.gov.ua/").openStream();
    //   OutputStream dst = new  FileOutputStream("c:/zem.txt");
         OutputStream dst = System.out;
                copy(src, dst);
    }

    // недол≥ки такого методу коп≥юванн€ те, що в≥н за кожним б≥том звертаЇтьс€ до HDD
    public static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true){
            int data = src.read(); //read()- читаЇ по б≥тово ≥ автоматом переводить в int
            System.out.println(data);
            if (data != -1){ // якщо зак≥нчитьс€ пот≥к байт≥в то InputStream поверне -1
                dst.write(data);
            }else{
                return;
            }
        }
    }
}
