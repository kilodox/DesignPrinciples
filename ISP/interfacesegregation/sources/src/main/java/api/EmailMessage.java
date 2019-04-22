package api;

import java.util.List;

public interface EmailMessage {

    List<String> getCcRecipients();

    void setCcRecipients(List<String> ccRecipients);

    List<String> getBccRecipients();

    void setBccRecipients(List<String> bccRecipients);
}
