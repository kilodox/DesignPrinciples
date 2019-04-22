package impl;

import api.Attachments;
import api.Message;
import common.Attachment;
import common.MessageType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SkypeVideo extends AbstractMessage implements Message, Attachments {

    private final MessageType type = MessageType.VIDEO;
    private List<Attachment> attachments = new ArrayList();

    public SkypeVideo() {
    }

    public SkypeVideo(String firstRecipient) {
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
    public List<Attachment> getAttachments() {
        return attachments;
    }
    @Override
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SkypeVideo that = (SkypeVideo) o;
        return type == that.type &&
                Objects.equals(attachments, that.attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, attachments);
    }
}
