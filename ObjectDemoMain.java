package Week6.Session24_JDK_8_UPDATE;
class ObjectDemo implements Cloneable{
    String name;

    public ObjectDemo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name is :: "+name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
public class ObjectDemoMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectDemo obj_1 = new ObjectDemo("Ashraf");
        System.out.println(obj_1);

        ObjectDemo obj_2 = new ObjectDemo("Shaikh");
        System.out.println(obj_2);

        System.out.println("Equals method of Object Class :: "+obj_1.equals(obj_2));

        ObjectDemo obj_3 = (ObjectDemo) obj_1.clone();
        System.out.println("Cloned Object created :: "+obj_3);

        System.out.println("Hashcode obj_1 :: "+obj_1.hashCode());

        System.out.println("Class Name of obj_1 :: "+obj_1.getClass());

    }
}

/*

Name is :: Ashraf
Name is :: Shaikh

Equals method of Object Class :: false

Cloned Object created :: Name is :: Ashraf

Hashcode obj_1 :: 558638686

Class Name of obj_1 :: class Week6.Session24_JDK_8_UPDATE.ObjectDemo


* */