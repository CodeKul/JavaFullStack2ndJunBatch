package java8;

@FunctionalInterface
public interface Message {
    void sendMsg();
    default void sendPicture(){
        System.out.println("send Picture");
    }

    default void sendMms(){
        System.out.println("send Mms");
    }
}
class SendMessage implements Message{
    @Override
    public void sendMsg() {
        System.out.println("send message");
    }
}
class MessageImpl{
    public static void main(String[] args) {
        Message message = new SendMessage();
        message.sendMsg();
        message.sendPicture();

        Message sendMessage = () -> {
            System.out.println("in lambda");
        };
        sendMessage.sendMsg();
        sendMessage.sendPicture();
    }
}
