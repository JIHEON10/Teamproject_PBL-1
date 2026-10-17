import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import myClass.User;
import myClass.Book;

/**
 * 대출 정보(이용자 -> 책)를 HashMap으로 저장하고 관리하는 클래스
 *
 * @author (9팀)
 * @version (2026.10.21)
 */
public class LoanDB
{
    private HashMap<User, Book> loanDB;

    public LoanDB()
    {
        loanDB = new HashMap<User, Book>();
    }

    /**
     * 대출 정보를 추가한다.
     *
     * @param user 이용자
     * @param book 책 
     */
    public void addLoan(User user, Book book)
    {
        loanDB.put(user, book);
    }

    /**
     * 이용자의 대출 정보를 삭제한다.
     *
     * @param user 이용자
     * @return  반납된 책
     */
    public Book removeLoan(User user)
    {
        return loanDB.remove(user);
    }

    /**
     * 이용자가 대출 중인 책을 찾는다.
     *
     * @param  user 이용자
     * @return  대출 중인 책
     */
    public Book findLoan(User user)
    {
        return loanDB.get(user);
    }

    /**
     * 모든 대출 정보를 출력한다
     */
    public void printAllLoans()
    {
        Set<User> keys = loanDB.keySet();
        Iterator<User> it = keys.iterator();
        while (it.hasNext())
        {
            User user = it.next();
            System.out.println(user + " -> " + loanDB.get(user));
        }
    }
}