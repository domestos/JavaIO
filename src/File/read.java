package File;

import java.io.File;
import java.io.IOException;

/**
 * Created by v.pelenskyi on 15.10.2015.
 */
public class read {
    public static void main(String[] args) throws IOException {
        File javaFile = new File("c:/testFile");

        // *********************   ������ �� �� ���������� ����� �� HDD

                javaFile.isAbsolute(); //�������� �� ���� ���������� �� ��������

                javaFile.getPath(); // ���� ����� - c:/testFile

                javaFile.getName(); // ��� ����� - testFile

                javaFile.getParent(); // ����������� ���� -  c:\

        // *********************   ������ �� ���������� ����� �� HDD

                javaFile.getAbsolutePath(); //���� �������� ��������� ����, �� �� ���� ������

                javaFile.getCanonicalPath(); // ������ : , .  - ������� ������ �� �����

                javaFile.exists(); // �������� �� ���� ����

                javaFile.isFile(); // �������� �� ��������� �� ������

                javaFile.canRead(); // �������� �� ����� ���������� � ����  (���� ������� ���� - ������� 0)

                javaFile.length(); // ��� ������� ����� (� ������) (���� ������� ���� - ������� 0)

                javaFile.lastModified(); //  ���� ������� ��� ������������� ���� (���� ������� ���� - ������� 0)

        // ******************* �������� ���������

        File src = new File("c:/Windows");

        src.exists(); //  �������� �� ���� ����� ����

        src.isDirectory(); //  �������� �� �� ����

        src.list(); // ������� ����� ����� �������� � ����� (���� ������� ���� - ������� 0)

        src.listFiles();  // ������� ��������� ����� (���� ������� ���� - ������� 0)

        // �������� ������ ��� ����� � �������� � ��� ���������� exe
        final File[] files = src.listFiles(); // ��� ��� �������� ����


    }




}
