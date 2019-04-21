package task;

import java.util.stream.Collectors;

public class WordloadConverter implements Converter {
    @Override
    public String convert(Record record) {
        if (record instanceof WorkloadRecord) {
            WorkloadRecord wRec = (WorkloadRecord) record;
            return wRec.getWorkload().entrySet()
                    .stream()
                    .map(e -> e.getKey() + ":" + e.getValue())
                    .collect(Collectors.joining(", ", "workload: ", ""));
        } else {
            return "record no: " + record.getId();
        }
    }
}
