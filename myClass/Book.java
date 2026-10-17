package myClass;

/**
 * 책 객체 Book 클래스
 *
 * @author (9팀)
 * @version (2026.10.21)
 */
public class Book extends DB_Element
{
    private String author; 
    private String bookID;
    private String publisher;  
    private String title; 
    private int year;
    
    /**
     * 책 객체를 생성한다.
     *
     * @param author 책의 저자
     * @param bookID 책의 등록 번호
     * @param publisher 책의 출판사
     * @param title 책의 제목
     * @param year 책의 출판 연도
     */
    public Book(String author,String bookID,String publisher,String title,int year)
    {
        this.author = author;
        this.bookID = bookID;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }
    /**
     * 책의 등록 번호를 반환한다.
     *
     * @return 책의 등록 번호 (bookID)
     */
    public String getID()
    {
        return bookID;
    }
    /**
     * 책의 등록 번호, 제목, 저자, 출판사, 출판 연도를 문자열로 반환한다.
     *
     * @return "(등록 번호) 제목, 저자, 출판사, 출판 연도" 형식의 책 정보
     */
    public String toString()
    {
        return "(" +bookID+ ") " +title+ ", " +author+ ", " +publisher+ ", " +year;
    }
}
