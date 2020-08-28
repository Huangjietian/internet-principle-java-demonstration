package cn.kerninventory.demos.internetprinciple.message;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class TransmissionControlProtocolMessage {

    public TransmissionControlProtocolMessage(HyperTextTransferProtocolMessage httpMessage) {
        this.httpMessage = httpMessage;
        head = new TransmissionControlProtocolHead();
    }

    TransmissionControlProtocolHead head;
    HyperTextTransferProtocolMessage httpMessage;

    public class TransmissionControlProtocolHead {

    }
}
