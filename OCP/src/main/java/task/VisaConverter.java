package task;

public class VisaConverter implements Converter {
    @Override
    public String convert(Record record) {
        if (record instanceof VisaRecord) {
            VisaRecord vRec = (VisaRecord) record;
            return "visa: " + vRec.getCountry() + ", from: " + vRec.getFrom() + ", to: " + vRec.getTo();
        } else{
            return "record no: " + record.getId();
        }
    }
}
