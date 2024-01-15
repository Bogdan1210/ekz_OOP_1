public class Main {
    private int privateVariable1;
    private String privateVariable2;
    private double privateVariable3;

    private void initializeVariables() {
        privateVariable1 = 10;
        privateVariable2 = "Hello, World!";
        privateVariable3 = 3.14;
    }

    public static void main(String[] args) {

        Main myObject = new Main();

        myObject.initializeVariables();
        
        System.out.println("privateVariable1: " + myObject.privateVariable1);
        System.out.println("privateVariable2: " + myObject.privateVariable2);
        System.out.println("privateVariable3: " + myObject.privateVariable3);
    }
}

