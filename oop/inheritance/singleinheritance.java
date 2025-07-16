class parentClass {
    public int a;

    parentClass(int a) {
        System.out.println("parent  class constructor call\n " + a);
    }

    public void parentclassMthd(int a) {

        System.out.println("parent class method" + a);
    }

    class childClass extends parentClass {

        childClass(int a) {
            super(a);
            System.out.println("child class constructor");
        }

        public int a;

        public void childClassMthd() {
            a = 20;
            System.out.println("child class method\n" + super.a);
        }
    }

public class singleinheritance {

    public static void main(String[] args) {
        childClass cc = new childClass(10);

        cc.childClassMthd();

    }

}
