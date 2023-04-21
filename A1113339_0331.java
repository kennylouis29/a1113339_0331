package A1113339_0331;
import java.util.Scanner;

class animal {
    String name;
    double height;
    int weight;
    int speed;
    double x;
    double y;
    int z;

    animal(String name, double height, int weight, int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    Scanner sc = new Scanner(System.in);

    double distance() {
        System.out.println("Enter time (in minute) and acceleration: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        x = x * this.speed * y ;
        System.out.println("Distance: " + x + "\n");
        return x;
    }

    int distance2() {
        System.out.println("Enter time (in minute): ");
        z = sc.nextInt();

        if (z == 0) {
            System.out.println("No \n");
        }

        else {
        z = z * this.speed;
        System.out.println("Distance (only time): " + z + "\n");
        }
        return z;
    }

    double distance3() {
        System.out.println("(Elsa = x2) Enter time (in minute) and acceleration: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        x = x * this.speed * y * 2;
        System.out.println("Distance: " + x + "\n");
        return x;
    }

    int distance4() {
        System.out.println("(Elsa = x2) Enter time (in minute): ");
        z = sc.nextInt();

        if (z == 0) {
            System.out.println("Cannot be processed. \n");
        }

        else {
        z = z * this.speed * 2;
        System.out.println("Distance (only time): " + z + "\n");
        }
        return z;
    }

}

public class A1113339_0331 {
    public static void ShowInfo() {
        System.out.println("Welcome to the Frozen system! \n");
    }
    
    public static void main (String [] args) {
        A1113339_0331.ShowInfo();

        snow h1 = new snow("Olaf", 1.1, 52, "X", false, 100);
        System.out.println("Name: " + h1.name + "\t" + "Height: " + h1.height + "\t" + "Weight: " + h1.weight + "\t" + "Gender: " + h1.gender + "\t" + "Ice Power: " + h1.frost + "\t" + "Speed: " + h1.speed);
        h1.distance();
        h1.distance2();

        snow h2 = new snow("Sven", 1.5, 99, "X", false, 200);
        System.out.println("Name: " + h2.name + "\t" + "Height: " + h2.height + "\t" + "Weight: " + h2.weight + "\t" + "Gender: " + h2.gender + "\t" + "Ice Power: " + h2.frost + "\t" + "Speed: " + h2.speed);
        h2.distance();
        h2.distance2();
        
        snow h3 = new snow("Hans", 1.9, 80, "Male", false, 150);
        System.out.println("Name: " + h3.name + "\t" + "Height: " + h3.height + "\t" + "Weight: " + h3.weight + "\t" + "Gender: " + h3.gender + "\t" + "Ice Power: " + h3.frost + "\t" + "Speed: " + h3.speed);
        h3.distance();
        h3.distance2();

        snow h4 = new snow("Kristoff", 1.8, 78, "Male", false, 130);
        System.out.println("Name: " + h4.name + "\t" + "Height: " + h4.height + "\t" + "Weight: " + h4.weight + "\t" + "Gender: " + h4.gender + "\t" + "Ice Power: " + h4.frost + "\t" + "Speed: " + h4.speed);
        h4.distance();
        h4.distance2();

        snow h5 = new snow("Anna", 1.7, 48, "Female", false, 120);
        System.out.println("Name: " + h5.name + "\t" + "Height: " + h5.height + "\t" + "Weight: " + h5.weight + "\t" + "Gender: " + h5.gender + "\t" + "Ice Power: " + h5.frost + "\t" + "Speed: " + h5.speed);
        h5.distance();
        h5.distance2();

        snow h6 = new snow("Elsa", 1.7, 50, "Female", true, 120);
        System.out.println("Name: " + h6.name + "\t" + "Height: " + h6.height + "\t" + "Weight: " + h6.weight + "\t" + "Gender: " + h6.gender + "\t" + "Ice Power: " + h6.frost + "\t\t" + "Speed: " + h6.speed);
        h6.distance3();
        h6.distance4();
    }
}

