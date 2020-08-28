package cn.kerninventory.demos.internetprinciple.message;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class HttpIpServer {

    HyperTextTransferProtocolMessage unpack(EthernetMessage message) {
        return message.ipMessage.tcpMessage.httpMessage;
    }

    EthernetMessage pack(HyperTextTransferProtocolMessage httpMessage) {
        return new EthernetMessage(new InternetProtocolMessage(new TransmissionControlProtocolMessage(httpMessage)));
    }
}
