package myClass;

/**
 * 이용자 객체 User 클래스
 *
 * @author (9팀)
 * @version (2026.10.21)
 */
public class User extends DB_Element
{
    private String name;
    private Integer stID;

    /**
     *  이용자 객체를 생성한다.
     *
     * @param stID 이용자의 학번
     * @param name 이용자의 이름
     */
    public User(int stID, String name)
    {
        this.stID = stID;
        this.name = name;
    }

    /**
     * 이용자의 학번을 문자열로 반환한다.
     *
     * @return 이용자의 학번
     */
    public String getID()
    {
        return String.valueOf(stID);
    }

    /**
     * 이용자의 학번과 이름을 문자열로 반환한다.
     *
     * @return "[학번] 이름" 형식의 이용자 정보
     */
    public String toString()
    {
        return "[" +stID+ "] " +name;
    }
}