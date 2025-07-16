
public class seterGetter {
    private int var;

    public void setVar(int var) {
        this.var = var;
    }

    public int getVar() {
        return this.var;
    }

    public static void main(String[] args) {
        seterGetter sg = new seterGetter();
        sg.setVar(10);
        System.out.println(sg.getVar());
    }
}
