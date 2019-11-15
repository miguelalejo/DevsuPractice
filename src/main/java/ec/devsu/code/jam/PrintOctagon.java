package ec.devsu.code.jam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * GetInputFromUser
 */
@SpringBootApplication
public class PrintOctagon implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PrintDrawNumbers.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Octagon octagon = new Octagon();
        String[][] drwaOctagon = octagon.createOctaton(2);
        for (int i = 0; i < drwaOctagon.length; i++) {
            for (int j = 0; j < drwaOctagon[i].length; j++) {
                System.out.print(drwaOctagon[i][j] == null ? " " : drwaOctagon[i][j]);
            }
            System.out.println();
        }
        drwaOctagon = octagon.createOctaton(3);
        for (int i = 0; i < drwaOctagon.length; i++) {
            for (int j = 0; j < drwaOctagon[i].length; j++) {
                System.out.print(drwaOctagon[i][j] == null ? " " : drwaOctagon[i][j]);
            }
            System.out.println();
        }

        drwaOctagon = octagon.createOctaton(4);
        for (int i = 0; i < drwaOctagon.length; i++) {
            for (int j = 0; j < drwaOctagon[i].length; j++) {
                System.out.print(drwaOctagon[i][j] == null ? " " : drwaOctagon[i][j]);
            }
            System.out.println();
        }

        drwaOctagon = octagon.createOctaton(5);
        for (int i = 0; i < drwaOctagon.length; i++) {
            for (int j = 0; j < drwaOctagon[i].length; j++) {
                System.out.print(drwaOctagon[i][j] == null ? " " : drwaOctagon[i][j]);
            }
            System.out.println();
        }

        drwaOctagon = octagon.createOctaton(20);
        for (int i = 0; i < drwaOctagon.length; i++) {
            for (int j = 0; j < drwaOctagon[i].length; j++) {
                System.out.print(drwaOctagon[i][j] == null ? " " : drwaOctagon[i][j]);
            }
            System.out.println();
        }

        drwaOctagon = octagon.createOctaton(31);
        for (int i = 0; i < drwaOctagon.length; i++) {
            for (int j = 0; j < drwaOctagon[i].length; j++) {
                System.out.print(drwaOctagon[i][j] == null ? " " : drwaOctagon[i][j]);
            }
            System.out.println();
        }

    }
}