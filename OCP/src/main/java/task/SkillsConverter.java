package task;

public class SkillsConverter implements Converter {
    @Override
    public String convert(Record record) {
        if (record instanceof SkillsRecord) {
            SkillsRecord sRec = (SkillsRecord) record;
            return "skills: " + sRec.getSkill() + "=" + sRec.getLevel();
        }else {
            return "record no: " + record.getId();
        }
    }
}
