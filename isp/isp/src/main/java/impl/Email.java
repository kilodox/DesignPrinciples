package impl;

import api.Attachments;
import api.EmailMessage;
import api.Message;
import api.Subject;
import common.Attachment;
import common.MessageType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Email extends AbstractMessage implements EmailMessage, Subject, Attachments, Message {

    private final MessageType type = MessageType.EMAIL;
    private String subject;
    private List<String> ccRecipients = new ArrayList();
    private List<String> bccRecipients = new ArrayList();
    private List<Attachment> attachments = new ArrayList();

    public Email() {
    }

    public Email(String firstRecipient) {
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
    public String getSubject() {
        return subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public List<String> getCcRecipients() {
        return ccRecipients;
    }

    @Override
    public void setCcRecipients(List<String> ccRecipients) {
        this.ccRecipients = ccRecipients;
    }

    @Override
    public List<String> getBccRecipients() {
        return bccRecipients;
    }

    @Override
    public void setBccRecipients(List<String> bccRecipients) {
        this.bccRecipients = bccRecipients;
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
        Email that = (Email) o;
        return type == that.type &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(ccRecipients, that.ccRecipients) &&
                Objects.equals(bccRecipients, that.bccRecipients) &&
                Objects.equals(attachments, that.attachments);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), type, subject, ccRecipients, bccRecipients, attachments);
    }
}
