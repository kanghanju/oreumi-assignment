package weeklyquiz.week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        try(Scanner sc = new Scanner(System.in)){//try-with-resource을 사용하여 자동으로 리소스 반환
            while (true) {//***을 사용하여 sout5번을 1번으로 줄였다.
                System.out.print("""
                        1. 비즈니스 연락처 추가
                        2. 개인 연락처 추가
                        3. 연락처 출력
                        4. 연락처 검색
                        5. 종료
                        메뉴를 선택해주세요:
                        """);
                int menu;

                try {//todo 예외처리
                    menu = sc.nextInt();
                } catch (InputMismatchException e) {//사용자가 int가 아닌 다른 타입으로 입력한 경우
                    System.out.println("숫자가 아닌 값을 입력했습니다.");
                    sc.next(); //잘못된 입력값 제거
                    continue;
                }

                switch (menu) {//if문을 switch문으로 변경
                    case 1:
                        System.out.print("이름을 입력하세요:");
                        String name1 = sc.next();
                        System.out.print("전화번호를 입력하세요:");
                        String number1 = sc.next();
                        System.out.print("회사명을 입력하세요:");
                        String company = sc.next();

                        addressBook.addContacts(new BusinessContact(name1, number1, company));
                        break;
                    case 2:
                        System.out.print("이름을 입력하세요:");
                        String name2 = sc.next();
                        System.out.print("전화번호를 입력하세요:");
                        String number2 = sc.next();
                        System.out.print("관계를 입력하세요:");
                        String relationship = sc.next();

                        addressBook.addContacts(new PersonalContact(name2, number2, relationship));
                        break;
                    case 3:
                        addressBook.displayContacts();
                        break;
                    case 4:
                        System.out.print("검색할 이름을 입력하세요:");
                        String name4 = sc.next();
                        addressBook.searchContact(name4);
                        break;
                    case 5:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    default:
                        System.out.println("잘못된 숫자가 입력되었습니다. 1~5 사이의 수를 입력해주세요.");
                        break;
                }
            }
        }
    }
}
