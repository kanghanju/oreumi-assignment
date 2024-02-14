package weeklyquiz.week3;

public class PersonalContact extends Contact{
    private String relationship;
    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public PersonalContact(String name,String phoneNumber,String relationship){
        super.setName(name);
        super.setPhoneNumber(phoneNumber);
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return String.format("%s,관계: %s",super.toString(),relationship);
    }
}
