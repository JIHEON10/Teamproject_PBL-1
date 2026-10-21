import DataBase.*;
import myClass.*;
/**
 * 실행 처리를 담당하는 App 클래스
 *
 * @author (9팀)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class App
{
    /**
     * 메소드 main
     *
     * @param args 파라미터
     */
    public static void main(String[] args)
    {
        // 1: 생성한다() -> libMS : LibraryManagementSystem으로
        LibraryManagementSystem libMS = new LibraryManagementSystem();
        
        // 2: setUserDB("c:\\Temp\\UserData2025.txt"), userDB 반환
        LibDB<User> userDB = libMS.setUserDB("c:\\Temp\\UserData2025.txt");
        
        // 3: 이용자 목록 출력
        System.out.println("----- 이용자 목록 출력 -----");
        libMS.printDB(userDB);
        System.out.println("");
        
        // 4: setBookDB("c:\\Temp\\BookData2025.txt"), bookDB 반환
        LibDB<Book> bookDB = libMS.setBookDB("c:\\Temp\\BookData2025.txt");
        
        // 5: 책 목록 출력
        System.out.println("----- 책 목록 출력 -----");
        libMS.printDB(bookDB);
        System.out.println("");
        
        // 6: 대출 작업 수행
        libMS.borrowBook("2025320001","B02");
        //6.2
        libMS.borrowBook("2025320002","B03");
        //6.3
        libMS.borrowBook("2025320003","B04");
        
        // 7: 대출 현황 출력
        libMS.printLoanList();
        
    }

}