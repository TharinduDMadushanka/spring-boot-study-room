package lk.practice;



public class Dev {

//    private Laptop laptop;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev(){
        System.out.println("Dev constructor");
    }

    public void build(){

        System.out.println("Working on a project.");
//        laptop.compile();
    }
}
