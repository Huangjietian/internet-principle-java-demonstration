package cn.kerninventory.demos.internetprinciple.message;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class EthernetMessage {

    public EthernetMessage(InternetProtocolMessage ipMessage) {
        this.ipMessage = ipMessage;
        head = new EthernetHead();
    }

    EthernetHead head;
    InternetProtocolMessage ipMessage;

    public class EthernetHead {

    }
}
