import DataBase.*;
import myClass.*;
/**
 * App 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class App
{
    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public static void main(String[] args)
    {
        // 1: 생성한다() -> libMS : LibraryManagementSystem으로
        LibraryManagementSystem libMS = new LibraryManagementSystem();
        
        // 2: setUserDB("c:\\Temp\\UserData2025.txt"), userDB 반환
        LibDB<User> userDB = libMS.setUserDB("c:\\Temp\\UserData2025.txt");
        
        // 3: printDB(userDB)
        System.out.println("----- 이용자 목록 출력 -----");
        libMS.printDB(userDB);
        System.out.println("");
        
        // 4: setBookDB("c:\\Temp\\BookData2025.txt"), bookDB 반환
        LibDB<Book> bookDB = libMS.setBookDB("c:\\Temp\\BookData2025.txt");
        
        // 5: printDB(bookDB)
        System.out.println("----- 책 목록 출력 -----");
        libMS.printDB(bookDB);
        System.out.println("");
        
        //6.1:borrowBook("2025320001","B02")
        libMS.borrowBook("2025320001","B02");
        //6.2:borrowBook("2025320002","B03")
        libMS.borrowBook("2025320002","B03");
        //6.3:borrowBook("2025320003","B04")
        libMS.borrowBook("2025320003","B04");
        
        // 7: printLoanList()
        libMS.printLoanList();
        
    }

}