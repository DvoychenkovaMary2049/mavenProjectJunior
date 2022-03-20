package lesson22;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CopyWithBufferIO withBufferIO = new CopyWithBufferIO();
        CopyWithNIO withNIO = new CopyWithNIO();
        CopyWithGuava withGuava = new CopyWithGuava();

        long start1 = System.currentTimeMillis();
        try {
            withBufferIO.copy("D:\\Games\\1450757031_2-86.jpg", "1.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Копирование с буффером IO: " + (end1-start1));

        long start2 = System.currentTimeMillis();
        try {
            withNIO.copy("D:\\Games\\1450757031_2-86.jpg", "2.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Копирование с буффером NIO: " + (end2-start2));

        long start3 = System.currentTimeMillis();
        try {
            withGuava.copy("D:\\Games\\1450757031_2-86.jpg", "3.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end3 = System.currentTimeMillis();
        System.out.println("Копирование с буффером Guava: " + (end3-start3));

    }
}
