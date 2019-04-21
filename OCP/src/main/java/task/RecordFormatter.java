package task;

public class RecordFormatter {

    public String format(Record record, Converter converter) {
        try {
            return converter.convert(record);
        } catch (CovertException e) {
            return "record no: " + record.getId();
        }
    }

}
