package java8;
@FunctionalInterface
interface Messageable1{
    void msg();
}
public class InstanceMethodReferenceDemo {
    public void msgMe(){
        System.out.println("This is reference to a instance method");
    }

}
class InstanceMethodDemoImpl{
    public static void main(String[] args) {

//        Messageable1 messageable1 = () -> {
//            InstanceMethodReferenceDemo instanceMethod = new InstanceMethodReferenceDemo();
//            instanceMethod.msgMe();
//        };
        InstanceMethodReferenceDemo instanceMethod = new InstanceMethodReferenceDemo();
        Messageable1 messageable1 = instanceMethod::msgMe;
        messageable1.msg();
    }
}