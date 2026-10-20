------------------------------------------------------------------------
이것은 프로젝트 README 파일입니다. 여기에 프로젝트에 대한 설명을 기입하세요.
이 프로젝트에 대한 모든 내용을 설명하세요.
적어도 다음과 같은 내용이 포함되어야합니다.:
------------------------------------------------------------------------

작업 편하게 하기 위한 함수 모음집

패키지 myClass

dbelement 클래스 -> getID()

하위클래스 Book -> Book(author,bookID,publisher,title,year) -> return 없음
    	 getID() -> return bookID()
	 toString() -> return (등록번호) 제목,저자,출판사,출판연도

하위클래스 User -> User(stID, name) -> return 없음
	 getID() -> return stID()
	 toString() -> return [학번] 이름

패키지 DataBase

LibDB 클래스 -> db라는 변수 선언(ArrayList임)
	       LibDB() (빈 arraylist 생성하는 작업) -> return 없음
	       addElement(T) (db에 요소 1개 추가) -> return 없음
	       findElement(String) (ID로 요소 검색) -> return 찾은 요소(T)
	       printAllElements() (db 모든 요소 출력) -> return 없음

/////////////////////////////////////////

LibraryManagementSystem 클래스 -> xxDB 3개(하나는 해쉬맵) 선언 및 객체 생성
				borrowBook(userID,bookID) -> return 없음
				printDB(db) ->retrun 없음
				printLoanList() (대출 목록 출력) -> return 없음
				setBookDB(bookFile) -> retrun LibDB<Book>
				setUserDB(userFile) -> return LibDB<User>

App 클래스
1: 생성한다() -> libMS : LibraryManagementSystem으로
2: setUserDB("c:\\Temp\\UserData2025.txt"), userDB 반환
3: printDB(userDB)
4: setBookDB("c:\\Temp\\BookData2025.txt"), bookDB 반환
5: printDB(userDB)
6.1:borrowBook("2025320001","B02")
6.2:borrowBook("2025320002","B03")
6.3:borrowBook("2025320003","B04")
7: printLoanList()