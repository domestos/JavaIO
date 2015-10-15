package File;

import java.io.File;
import java.io.IOException;

/**
 * Created by v.pelenskyi on 15.10.2015.
 */
public class read {
    public static void main(String[] args) throws IOException {
        File javaFile = new File("c:/testFile");

        // *********************   Методи які НЕ потребують досту до HDD

                javaFile.isAbsolute(); //перевіряє чи шлях абсолютний чи відносний

                javaFile.getPath(); // шлях файлу - c:/testFile

                javaFile.getName(); // імя файла - testFile

                javaFile.getParent(); // батьківський шлях -  c:\

        // *********************   Методи які потребують досту до HDD

                javaFile.getAbsolutePath(); //якщо вказаний фідносний шлях, то він шукає повний

                javaFile.getCanonicalPath(); // відкидає : , .  - потребує доступ до диску

                javaFile.exists(); // перевіряє чи існує файл

                javaFile.isFile(); // перевіряє чи являється ЦЕ файлом

                javaFile.canRead(); // перевіряє чи можна записувати у файл  (якщо відсутній файл - повертає 0)

                javaFile.length(); // яка довжина файлу (в байтах) (якщо відсутній файл - повертає 0)

                javaFile.lastModified(); //  коли останній раз модифікувався файл (якщо відсутній файл - повертає 0)

        // ******************* Перевірка Деректорій

        File src = new File("c:/Windows");

        src.exists(); //  перевіряє чи існує такий шлях

        src.isDirectory(); //  перевіряє чи це шлях

        src.list(); // повертає масив строк вказаних у шляху (якщо відсутній файл - повертає 0)

        src.listFiles();  // повертає екземляри файлів (якщо відсутній файл - повертає 0)

        // отримати список всіх файлів в деректорії у якиї розширення exe
        final File[] files = src.listFiles(); // тут слід передати обєкт


    }




}
