package eu.sig.training.ch05.buildandsendmail;

import eu.sig.training.ch05.buildandsendmail.EmailContent;
import eu.sig.training.ch05.buildandsendmail.Person;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, Person person,  MailFont font, EmailContent emailContent) {
        // Format the email address
        String mId = person.getFirstName().charAt(0) + "." + person.getLastName().substring(0, 7) + "@"
            + person.getDivision().substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(font,
            emailContent.getMessage1() + emailContent.getMessage2()+ emailContent.getMessage3());
        // Send message
        m.send(mId, emailContent.getSubject(), mMessage);
    }
    // end::buildAndSendMail[]

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }

}