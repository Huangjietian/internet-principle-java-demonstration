package cn.kerninventory.demos.internetprinciple.message;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class InternetProtocolMessage {

    public InternetProtocolMessage(TransmissionControlProtocolMessage tcpMessage) {
        this.tcpMessage = tcpMessage;
        head = new InternetProtocolHead();
        icmpMessage = new InternetControlMessageProtocolMessage();
    }

    InternetProtocolHead head;
    InternetControlMessageProtocolMessage icmpMessage;
    TransmissionControlProtocolMessage tcpMessage;

    public class InternetProtocolHead {

    }
}
