package lk.practice;


public class Dev {

    private Computer com;


    public Dev() {
        System.out.println("Dev constructor");
    }


    public Dev(Computer com) {
        this.com = com;
        System.out.println("Dev laptop constructor");
    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build() {

        System.out.println("Working on a project.");
        com.compile();
    }


}
