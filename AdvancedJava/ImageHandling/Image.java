package com.AdvancedJava.ImageHandling;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.awt.image.BufferedImage.TYPE_INT_ARGB;

public class Image {
    public static void main(String[] args) throws IOException {
        int width = 900;
        int height = 600;

        BufferedImage image = null;

        image = readFromFile(width, height, image);
        writeToFile(image);
    }

    private static void writeToFile(BufferedImage image) throws IOException {
        File fileOut = new File("C:\\Users\\tankh\\Downloads\\OUT.jpg");

        ImageIO.write(image, "jpg", fileOut);
        System.out.println("Write successfully");
    }

    private static BufferedImage readFromFile(int width, int height, BufferedImage image) throws IOException {
        File file = new File("C:\\Users\\tankh\\Downloads\\cartoon-comic-dino-dinosaur-green-ideas-smile-funny-gift-ideas.jpg");
        image = new BufferedImage(width, height, TYPE_INT_ARGB);

        image = ImageIO.read(file);
        System.out.println("Successfully read an image: " + image);

        return image;
    }
}
