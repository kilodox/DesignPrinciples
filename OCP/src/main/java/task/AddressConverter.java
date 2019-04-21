package task;

public class AddressConverter implements Converter {
    @Override
    public String convert(Record record){
        if (record instanceof AddressRecord) {
            AddressRecord aRec = (AddressRecord) record;
            return "address: " + aRec.getCountry() + ", " + aRec.getProvince() + ", " + aRec.getCity() + ", " +
                    aRec.getStreet() + " st., " + aRec.getBuilding() + " b., " + aRec.getApartment() + " apt., " +
                    aRec.getIndex();
        } else {
            return "record no: " + record.getId();
        }
    }
}
