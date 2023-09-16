public class Inheritance {

    // Move the 'person' class to be a static nested class
    public static class Person {
        String name;
        int age;

        void displayInfo1() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    // Move the 'Teacher' class to be a static nested class
    public static class Teacher extends Person {
        String qualification;

        void displayInfo2() {
            displayInfo1();
            System.out.println("Qualification: " + qualification);
        }
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Ronojit Kumar";
        t1.age = 30;
        t1.qualification = "Math Teacher";
        t1.displayInfo2();
    }
}

