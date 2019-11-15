package ec.devsu.code.jam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * GetInputFromUser
 */
@SpringBootApplication
public class PrintDrawNumbers implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PrintDrawNumbers.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DrawNumbers drawNumbers = new DrawNumbers();
        String[][] number = drawNumbers.printNumber(0);
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        number = drawNumbers.printNumber(2);
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        number = drawNumbers.printNumber(4);
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        number = drawNumbers.printNumber(15);
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        number = drawNumbers.printNumber(66);
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        number = drawNumbers.printNumber(78);
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        number = drawNumbers.printNumber(99);
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        number = drawNumbers.printNumber(-1);
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        number = drawNumbers.printNumber(100);
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        number = drawNumbers.printNumber(30);
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]);
            }
            System.out.println();
        }
    }
}