package weeklyquiz.week3;

public class Contact {
    private String name;

    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //toString을 오버라이딩 하면 중복코드를 없앨 수 있다 !!
    @Override
    public String toString(){
        return String.format("이름: %s, 전화번호: %s",this.name,this.phoneNumber);
    }
}
