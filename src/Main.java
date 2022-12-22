import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker [] workers = new Worker[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1 employee's name, post, year of employment in format YYYY");
            workers [0] = new Worker(in.nextLine(), in.nextLine(), in.nextLine());
        System.out.println("Enter the 2 employee's name, post, year of employment in format YYYY");
            workers [1] = new Worker(in.nextLine(), in.nextLine(), in.nextLine());
        System.out.println("Enter the 3 employee's name, post, year of employment in format YYYY");
            workers [2] = new Worker(in.nextLine(), in.nextLine(), in.nextLine());
        System.out.println("Enter the 4 employee's name, post, year of employment in format YYYY");
            workers [3] = new Worker(in.nextLine(), in.nextLine(), in.nextLine());
        System.out.println("Enter the 5 employee's name, post, year of employment in format YYYY");
            workers [4] = new Worker(in.nextLine(), in.nextLine(), in.nextLine());

            Comparator <Worker> abc = Comparator.comparing(Worker::getName);
            Arrays.sort(workers, abc);

        for (Worker temp: workers) {
            System.out.println(temp);
        }

        System.out.println("Enter you value experience\n ");
        int value = in.nextInt();
        for (int i = 0; i < workers.length; i++) {
            int experience = 2022 - Integer.parseInt(workers[i].data);
            if (experience > value)
                System.out.println(workers[i].name);
        }


    }

}
