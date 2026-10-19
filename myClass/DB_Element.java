package myClass;

/**
 * 책과 이용자 객체가 공통으로 상속하는 추상 클래스
 *
 * @author (9팀)
 * @version (2026.10.21)
 */
public abstract class DB_Element
{   
    /**
     * 데이터베이스 요소의 고유 ID를 반환한다.
     */
    public abstract String getID();
}