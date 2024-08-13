public class Clone implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String str = "New Object Created";

    public static void main(String[] args) {

        Clone obj1 = new Clone();

        try {
            Clone obj2 = (Clone) obj1.clone();
            System.out.println(obj2.str);
        } 
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
