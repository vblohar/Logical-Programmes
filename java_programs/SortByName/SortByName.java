import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double cpga;

    public Student(int var1, String var2, double var3) {
        this.id = var1;
        this.name = var2;
        this.cpga = var3;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int var1) {
        this.id = var1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public double getCpga() {
        return this.cpga;
    }

    public void setCpga(double var1) {
        this.cpga = var1;
    }
}

public class SortByName {
    public static void main(String[] var0) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Student> list = new ArrayList<>();
        while (num > 0){
            int id = sc.nextInt();
            String name = sc.next();
            double cpgs = sc.nextDouble();

            Student sd = new Student(id, name, cpgs);

            list.add(sd);
            System.out.println("Vaibhav");
            num--;
        }

    }
}