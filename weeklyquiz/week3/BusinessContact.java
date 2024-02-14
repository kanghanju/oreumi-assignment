package weeklyquiz.week3;

public class BusinessContact extends Contact{
    private String company;
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public BusinessContact(String name,String phoneNumber,String company){
        super.setName(name);
        super.setPhoneNumber(phoneNumber);
        this.company = company;
    }

    @Override
    public String toString() {
        return String.format("%s,회사: %s",super.toString(),company);
    }
}
