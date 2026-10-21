package DataBase;
import java.util.*;
import myClass.DB_Element;

/**
 *  DB_Element를 상속한 책, 이용자 객체를 저장하고 관리하는 제네릭 데이터베이스 클래스
 *
 * @author (9팀)
 * @version (2026.10.21)
 */
public class LibDB<T extends DB_Element>
{
    private ArrayList<T> db; //p416 ArrayList

    public LibDB()
    {
        db = new ArrayList<>();
    }

    /**
     * 데이터베이스에 책 또는 이용자 객체를 추가한다.
     *
     * @param element 추가할 책 또는 이용자 객체
     */
    public void addElement(T element)
    {
        db.add(element);
    }

    /**
     * 지정한 ID와 일치하는 객체를 데이터베이스에서 찾는다.
     *
     * @param id - 검색할 객체의 ID
     * @return ID가 일치하는 객체. 찾지 못하면 null
     */
    public T findElement(String id)
    {
        Iterator<T> it = db.iterator(); //p422 컬렉션의 순차 검색을 위한 Itertor
        while (it.hasNext())
        {
            T element = it.next();

            if (element.getID().equals(id))
            {
                return element;
            }
        }
        return null;
    }

    /**
     * 데이터베이스에 저장된 모든 요소를 한 줄씩 출력한다.
     */
    public void printAllElements()
    {
        for (T element : db)
        {
            System.out.println(element);
        }
    }
}
