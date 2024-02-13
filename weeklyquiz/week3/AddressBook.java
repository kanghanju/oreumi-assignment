package weeklyquiz.week3;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContacts(Contact contact){
        contacts.add(contact);
    }

    public void displayContacts(){
        if(contacts.size() == 0){
            System.out.println("연락처가 비어있습니다.");
            return;
        }

        for(Contact contact : contacts) {
            if(contact instanceof BusinessContact) {
                System.out.println("이름: "+contact.getName() +", 전화번호: " + contact.getPhoneNumber()
                        + ", 회사명: "+ ((BusinessContact) contact).getCompany());
            }

            if(contact instanceof PersonalContact) {
                System.out.println("이름: "+contact.getName() +", 전화번호: " + contact.getPhoneNumber()
                        + ", 관계: "+ ((PersonalContact) contact).getRelationship());
            }
        }
    }

    public void searchContact(String name){
        int findNum = 0;

        for(Contact contact : contacts) {
            if(contact.getName().equals(name) && contact instanceof BusinessContact) {
                System.out.println("이름: "+contact.getName() +", 전화번호: " + contact.getPhoneNumber()
                        + ", 회사명: "+ ((BusinessContact) contact).getCompany());
                findNum++;
            }

            if(contact.getName().equals(name) && contact instanceof PersonalContact) {
                System.out.println("이름: "+contact.getName() +", 전화번호: " + contact.getPhoneNumber()
                        + ", 관계: "+ ((PersonalContact) contact).getRelationship());
                findNum++;
            }
        }

        if(findNum == 0){
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}
