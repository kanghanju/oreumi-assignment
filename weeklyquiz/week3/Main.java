package weeklyquiz.week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int input = -1;

        System.out.println("1.비즈니스 연락처 추가");
        System.out.println("2.개인 연락처 추가");
        System.out.println("3.연락처 출력");
        System.out.println("4.연락처 검색");
        System.out.println("5.종료");

        while(true){
            System.out.println("메뉴를 선택해주세요:");
            try{
                input = sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException e){//사용자가 int가 아닌 다른 타입으로 입력한 경우
                System.out.println("숫자가 아닌 값을 입력했습니다.");
                sc.next(); //잘못된 입력값 제거
                continue;
            }

            if(input == 1){
                System.out.println("이름을 입력하세요:");
                String name = sc.nextLine();
                System.out.println("전화번호를 입력하세요:");
                String number = sc.nextLine();
                System.out.println("회사명을 입력하세요:");
                String companyName = sc.nextLine();

                addressBook.addContacts(new BusinessContact(name,number,companyName));
            }else if(input == 2){
                System.out.println("이름을 입력하세요:");
                String name = sc.nextLine();
                System.out.println("전화번호를 입력하세요:");
                String number = sc.nextLine();
                System.out.println("관계를 입력하세요:");
                String relationship = sc.nextLine();

                addressBook.addContacts(new PersonalContact(name,number,relationship));
            }else if(input == 3){
                addressBook.displayContacts();
            }else if(input == 4){
                System.out.println("검색할 이름을 입력하세요:");
                String name = sc.nextLine();
                addressBook.searchContact(name);
            }else if(input == 5){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("잘못된 숫자가 입력되었습니다. 1~5 사이의 수를 입력해주세요.");
            }
        }

        sc.close();
    }
}
