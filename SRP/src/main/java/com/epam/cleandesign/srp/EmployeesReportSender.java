package com.epam.cleandesign.srp;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;
import java.util.Properties;

public class EmployeesReportSender {
    private String employees;

    public EmployeesReportSender(HtmlEmployees htmlEmployees) {
        this.employees = htmlEmployees.convert();
    }

    public void sendEmployeesReport() {

        String to = "abcd@gmail.com";
        String from = "web@gmail.com";
        String host = "localhost";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(properties);

        MimeMessage message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Employees report");

            String employeesHtml = employees;

            message.setContent(employeesHtml, "text/html; charset=utf-8");

            Transport.send(message);
        } catch (MessagingException e) {
            throw new IllegalStateException(e);
        }
    }
}
