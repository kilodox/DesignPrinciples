package api;

import common.Attachment;
import common.MessageType;

import java.util.List;

public interface Message {

    String getMessageBody();

    void setMessageBody(String messageBody);

    MessageType getType();

}
