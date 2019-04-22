package impl;


import api.Message;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMessage {

    protected List<String> recipients = new ArrayList<>();
    protected String messageBody;

    public List<String> getRecipients() {
        return recipients;
    }
    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

}
