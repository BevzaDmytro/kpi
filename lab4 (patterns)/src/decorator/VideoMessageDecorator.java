package decorator;

public class VideoMessageDecorator  extends SenderDecorator {
    public VideoMessageDecorator(MessageSender sender) {
        super(sender);
    }

    public void send(String data){
        data = data + " ,video link" ;
        wrappee.send(data);
    }
}
