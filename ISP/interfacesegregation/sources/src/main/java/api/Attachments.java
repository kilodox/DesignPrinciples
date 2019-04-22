package api;

import common.Attachment;

import java.util.List;

public interface Attachments {

    List<Attachment> getAttachments();

    void setAttachments(List<Attachment> attachments);
}
