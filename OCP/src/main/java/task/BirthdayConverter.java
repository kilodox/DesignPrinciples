package task;

public class BirthdayConverter implements Converter {
    @Override
    public String convert(Record record) {
        if (record instanceof BirthdayRecord) {
            BirthdayRecord bRec = (BirthdayRecord) record;
            return "birthday: " + bRec.getYear() + "/" + bRec.getMonth() + "/" + bRec.getDay();
    }else {
            return "record no: " + record.getId();
        }
    }
}
