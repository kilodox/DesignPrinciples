package impl;

import api.Attachments;
import common.Attachment;
import common.MessageType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MMS extends SMS implements Attachments {

    private final MessageType type = MessageType.MMS;
    private List<Attachment> attachments = new ArrayList();

    public MMS() {
    }

    public MMS(String firstRecipient) {
        getRecipients().add(firstRecipient);
    }

    @Override
    public MessageType getType() {
        return type;
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
        MMS mms = (MMS) o;
        return type == mms.type &&
                Objects.equals(attachments, mms.attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, attachments);
    }
}
