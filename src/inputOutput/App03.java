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

    // ������� ������ ������ ��������� ��, �� �� �� ������ ���� ���������� �� HDD
    public static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true){
            int data = src.read(); //read()- ���� �� ����� � ��������� ���������� � int
            System.out.println(data);
            if (data != -1){ // ���� ���������� ���� ����� �� InputStream ������� -1
                dst.write(data);
            }else{
                return;
            }
        }
    }
}
