package coding;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by v.pelenskyi on 07.10.2015.
 */
public class App00 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = new String(new byte[]{1, 0, 8, 2, 4});  //������ ����� ���������� � ����
        byte[] raw = str.getBytes("UTF-8"); //������ ����� ������� �� ����� ����  � �������� UTF-8
        byte[] raw2 = str.getBytes("ASCII"); //������ ����� ������� �� ����� ���� � �������� ASCII

//==============================================================

        // ���������� ������ � ����� ����
        byte[] myRaw = "Valera".getBytes();
        // �������� ����� ����
        System.out.println(Arrays.toString(myRaw));
        // �� ������ ���� ������� ������
        String myStr = new String(myRaw);
        // �������� ������ � ��� ���� ���������� � ������ ����
        System.out.println(myStr);

        System.out.println("A".getBytes("UTF-16").length);
        System.out.println("AA".getBytes("UTF-16").length);




    }
}
