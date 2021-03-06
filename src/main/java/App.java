
import java.io.*;
import nn.*;
import nncoach.*;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    private final static String PATH_TRAIN = "./data/mnist_train_short.csv";
    private final static String PATH_TEST = "./data/mnist_test_short.csv";


    public String getGreeting() {
        return "Hello";
    }


    public static void main(final String[] args) {


        Coach coach = new Coach(PATH_TRAIN, PATH_TEST, 784, 255.0);
        Network network = new Network(784, 200, 10);


        coach.train(network);
        coach.test(network);

        System.out.println("Done");
    }
}
