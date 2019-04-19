package task;

import java.util.stream.Collectors;

public class RecordFormatter {

    public void format(Record rec) {
        if (!(rec instanceof AddressRecord) && !(rec instanceof BirthdayRecord) && !(rec instanceof FeedbackRecord)
                && !(rec instanceof SkillsRecord) && !(rec instanceof VisaRecord) && !(rec instanceof WorkloadRecord)) {
            System.out.println("record no: " + rec.getId());
        } else {
            rec.printAll();
        }
    }
}
