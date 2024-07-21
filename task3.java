public class task3 {
    void display(int age, String name) {
        System.out.println("Name: " + name + " age: " + age);
    }

    public static void main(String[] args) {
        task3 obj = new task3(); // Create an instance of the task3 class
        obj.display(20, "vallika"); // Call the display method using the instance
    }
}
