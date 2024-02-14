package weeklyquiz.week3;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook(){
        this.contacts = new ArrayList<>();
    }

    public void addContacts(Contact contact){
        contacts.add(contact);
    }

    public void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("연락처가 비어있습니다.");
            return;
        }

        for(Contact contact : contacts) {
            if(contact instanceof BusinessContact) {
                //toString을 오버라이딩 해줬기 때문에 instanceOf로 일일히 비교할 필요가 없다.
                System.out.println(contact);
            }
        }
    }

    public void searchContact(String name){
        boolean isSearch = false;

        //toString을 오버라이딩 해줬기 때문에 instanceOf로 일일히 비교할 필요가 없다.
        for(Contact contact : contacts) {
            if(contact.getName().equals(name)) {
                System.out.println(contact);
                isSearch = true;
            }
        }

        if(!isSearch){
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}
