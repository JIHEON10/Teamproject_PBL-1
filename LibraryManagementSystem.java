import java.util.*;
import DataBase.*;
import myClass.*;
import java.io.*;
/**
 * 도서관관리시스템 내에서 수행하는 여러 처리 작업을 정의해놓은
 * LibraryManagementSystem 클래스
 *
 * @author (9팀)
 * @version (2026.10.21)
 */
public class LibraryManagementSystem
{
    LibDB<Book> bookDB;
    HashMap<User, Book> loanDB;
    LibDB<User> userDB;
    //private 적어야하는지?
    /**
     * LibraryManagementSystem 생성자, 객체를 생성함
     *
     */
    public LibraryManagementSystem()
    {
        bookDB = new LibDB<>();
        loanDB = new HashMap<>();
        userDB = new LibDB<>();
    }

    /**
     * 사용자의 대출 작업을 수행하는 메소드 borrowBook
     *
     * @param userID 사용자ID
     * @param bookID 대출도서ID
     */
    public void borrowBook(String userID, String bookID)
    {
        User user = userDB.findElement(userID);
        Book book = bookDB.findElement(bookID);

        if (user !=null && book != null)
        {
            loanDB.put(user,book);
        }
    }

    /**
     * DB에 저장된 모든 요소를 출력하는 메소드 printDB
     *
     * @param db 출력할 데이터베이스
     */
    public <T extends DB_Element> void printDB(LibDB<T>db)
    {
        db.printAllElements();
    }

    /**
     * 등록된 도서 대출 현황을 출력하는 메소드 printLoanList
     *
     */
    public void printLoanList()
    {
        System.out.println("----- 대출 현황 -----");
        // 출력부분 구현(getkey랑 getvalue , for-each문 써야할듯해요)
        System.out.println("--------------------");
    }

    /**
     * 도서 데이터 파일을 활용하는 메소드 setBookDB
     *
     * @param bookFile 도서 정보가 저장된 파일 경로
     * @return LibDB<Book>
     */
    public LibDB<Book> setBookDB(String bookFile)
    {
        return bookDB; //수정필요, 파일 읽을 수 있게? 아니면 app에서?
    }

    /**
     * 도서 데이터 파일을 활용하는 메소드 setUserDB
     *
     * @param userFile 사용자 정보가 저장된 파일 경로
     * @return LibDB<User>
     */
    public LibDB<User> setUserDB(String userFile)
    {
        return userDB; //수정필요, 파일 읽을 수 있게? 아니면 app에서?
    }
}