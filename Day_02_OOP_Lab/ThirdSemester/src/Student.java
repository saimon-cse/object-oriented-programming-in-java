
public class Student {
    String name;
    int roll;

    void setInfo(String n, int r) {
        name = n;
        roll = r;
    }

    void showInfo() {
        System.out.println("Name: "+ name);
        System.out.println("Roll: "+ roll + "\n");
        //System.out.println();
    }
}
