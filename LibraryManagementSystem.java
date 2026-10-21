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
    HashMap<User, Book> loanDB; //p424 HashMap<K,V>
    LibDB<User> userDB;
    
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
        Set<User> keySet = loanDB.keySet();
        Iterator<User> it = keySet.iterator();
        
        //p121 while문        
        while(it.hasNext()) 
        {
            User user = it.next();
            Book book = loanDB.get(user);
            System.out.println(user+ " ===> " +book);
        }
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
        bookDB = new LibDB<Book>();
        //p154 try-catch-finally
        try 
        {
            File file = new File(bookFile);
            FileReader fin = new FileReader(file);
            Scanner scanner = new Scanner(fin);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                Scanner token = new Scanner(line);
                token.useDelimiter("/");

                String bookID = token.next();
                String title = token.next();
                String author = token.next();
                String publisher = token.next();
                String year1 = token.next();

                int year = Integer.parseInt(year1);

                Book book = new Book(author, bookID, publisher, title, year);
                bookDB.addElement(book);

                token.close();
            }

            scanner.close();

        } 
        catch (IOException e)
        {
            System.out.println("도서 파일 입출력 오류");
        }

        return bookDB;
    }

    /**
     * 도서 데이터 파일을 활용하는 메소드 setUserDB
     *
     * @param userFile 사용자 정보가 저장된 파일 경로
     * @return LibDB<User>
     */
    public LibDB<User> setUserDB(String userFile)
    {
        userDB = new LibDB<User>();

        try 
        {
            File file = new File(userFile); //p463 FileReader를 이용한 텍스트 파일읽기
            FileReader fin = new FileReader(file);
            Scanner scanner = new Scanner(fin);
            
            while (scanner.hasNext()) { //p.495 파일의 끝까지 반복하여 읽는다
                String line = scanner.nextLine(); // 한 라인 단위로 읽는다

                Scanner token = new Scanner(line);
                token.useDelimiter("/");

                String id = token.next();
                String name = token.next();
                int stID = Integer.parseInt(id);

                User user = new User(stID, name);
                userDB.addElement(user);

                token.close();
            }

            scanner.close();

        } 
        catch (IOException e) 
        {
            System.out.println("사용자 파일 입출력 오류");
        }

        return userDB;
    }
}