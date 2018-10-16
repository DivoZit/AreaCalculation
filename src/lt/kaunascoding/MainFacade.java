package lt.kaunascoding;

import lt.kaunascoding.factory.ShapeFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainFacade {

    public static void main(String[] args) {
        File file = new File("data.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ShapeFactory factory = new ShapeFactory(sc);
    }
}
