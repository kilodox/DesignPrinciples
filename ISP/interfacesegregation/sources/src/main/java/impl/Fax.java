package impl;

import api.FaxMessage;
import api.Message;
import api.Subject;
import common.Attachment;
import common.MessageType;

import java.util.List;
import java.util.Objects;

public class Fax extends AbstractMessage implements FaxMessage, Subject, Message {

    private final MessageType type = MessageType.FAX;
    private String companyName;
    private String callbackFax;
    private String subject;

    public Fax() {
    }

    public Fax(String firstRecipient) {
        getRecipients().add(firstRecipient);
    }

    @Override
    public MessageType getType() {
        return type;
    }

    @Override
    public String getMessageBody() {
        return messageBody;
    }

    @Override
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }
    @Override
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getCallbackFax() {
        return callbackFax;
    }
    @Override
    public void setCallbackFax(String callbackFax) {
        this.callbackFax = callbackFax;
    }

    @Override
    public String getSubject() {
        return subject;
    }
    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fax that = (Fax) o;
        return type == that.type &&
                Objects.equals(companyName, that.companyName) &&
                Objects.equals(callbackFax, that.callbackFax) &&
                Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), type, companyName, callbackFax, subject);
    }
}
