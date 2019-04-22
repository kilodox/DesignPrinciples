package impl;

import api.Message;
import common.Attachment;
import common.MessageType;

import java.util.List;
import java.util.Objects;

public class SMS extends AbstractMessage implements Message {

    private final MessageType type = MessageType.SMS;

    public SMS() {
    }

    public SMS(String firstRecipient) {
        getRecipients().add(firstRecipient);
    }

    @Override
    public MessageType getType() {
        return type;
    }

    @Override
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    public String getMessageBody() {
        return messageBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SMS sms = (SMS) o;
        return type == sms.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), type);
    }
}
