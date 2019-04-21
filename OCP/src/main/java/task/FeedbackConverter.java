package task;

public class FeedbackConverter implements Converter {
    @Override
    public String convert(Record record) {
        if (record instanceof FeedbackRecord) {
            FeedbackRecord fRec = (FeedbackRecord) record;
            return "feedback: " + fRec.getCriterion() + "=" + fRec.getQuality();
        }else {
            return "record no: " + record.getId();
        }
    }
}
