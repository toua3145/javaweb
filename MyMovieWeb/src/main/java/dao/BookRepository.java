package dao;

import java.util.ArrayList;
import dto.Book;


public class BookRepository{
	
	
	private ArrayList<Book> listOfBooks = new ArrayList<Book>();
	
	private static BookRepository instance = new BookRepository();

	public static BookRepository getInstance(){
		return instance;
	} 
	
	
	public BookRepository() {
	
		Book book1= new Book("movie1234","퍼펙트 게임", 127);
		book1.setAuthor("박희곤");
		book1.setDescription("대결을 원한 세상 속으로 꿈을 던진 두 남자, 최동원 선동열의 고독하고도 치열한 맞대결!! 불안과 격동의 1980년대, 프로야구는 단순한 스포츠를 넘어 전국민을 사로잡고 있었다! 노력과 끈기로 대한민국 최고의 투수로 자리잡은 롯데의 최동원! 그리고 최동원의 뒤를 이어 떠오르는 해태의 천재 투수 선동열! 세상은 우정을 나누던 선후배였던 두 사람을 라이벌로 몰아세우는데... 전적 1승 1패, 그리고 1987년 5월 16일, 자신들의 꿈을 걸어야 했던 최동원과 선동열의 마지막 맞대결이 펼쳐진다! 선동열 앞에서만은 큰 산이고 싶었던 최동원. 그 산을 뛰어 넘고 싶었던 선동열");
		book1.setPublisher("롯데엔터테인먼트");
		book1.setCategory("스포츠");
		book1.setUnitsInStock(1000);	
		book1.setReleaseDate("2011/12/21");
		book1.setFilename("movie1234.jpg");
		
		Book book2 = new Book("movie1235","글러브", 144);
		book2.setAuthor("강우석");
		book2.setDescription("최다 연승! 최다 탈삼진! 3년 연속 MVP! 한마디로 대한민국 프로야구 최고의 간판투수... 였던 김상남. 음주폭행에 야구배트까지 휘둘러 징계위원회에 회부되고 잠깐 이미지 관리나 하라는 매니저의 손에 이끌려 청각장애 야구부 ‘충주성심학교’ 임시 코치직을 맡게 된다. 야구부 전체 정원 10명, 더욱이 아이들의 실력은 정상인 중학교 야구부와 맞붙어서도 가까스로 이기는 실력. 듣지 못해 공 떨어지는 위치도 못 찾고, 말 못해 팀 플레이도 안 되는 이 야구부의 목표는 전국대회 첫 출전. 상남의 등장에 그 꿈에 한 발짝 더 가까이 왔다고 생각하는 아이들과 선생님들에게 상남은 여전히 “글쎄, 안 된다니까~”를 외친다. 그 누구보다 전국대회 출전에 부정적이었던 상남은 아무도 믿어주지도 않고, 자기가 친 홈런 소리조차 듣지 못하지만 글러브만 끼면 치고 달리며 행복해하는 아이들을 보며 묘한 울컥함을 느끼고, 급기야 또 한번 대형사고(?)를 치고 마는데…");
		book2.setPublisher("CJ ENM");
		book2.setCategory("스포츠");
		book2.setUnitsInStock(1000);		
		book2.setReleaseDate("2011/01/20");
		book2.setFilename("movie1235.jpg");
		
		Book book3= new Book("movie1236","머니볼", 133);
		book3.setAuthor("베넷 밀러");
		book3.setDescription("게임의 역사를 바꾼 감동의 리그가 시작된다! 메이저리그 만년 최하위에 그나마 실력 있는 선수들은 다른 구단에 뺏기기 일수인 ‘오클랜드 애슬레틱스’. 돈 없고 실력 없는 오합지졸 구단이란 오명을 벗어 던지고 싶은 단장 ‘빌리 빈(브래드 피트)’은 경제학을 전공한 ‘피터’를 영입, 기존의 선수 선발 방식과는 전혀 다른 파격적인 ‘머니볼’ 이론을 따라 새로운 도전을 시작한다. 그는 경기 데이터에만 의존해 사생활 문란, 잦은 부상, 최고령 등의 이유로 다른 구단에서 외면 받던 선수들을 팀에 합류시키고, 모두가 미친 짓이라며 그를 비난한다. 과연 빌리와 애슬레틱스 팀은 ‘머니볼’의 기적을 이룰 수 있을까?");
		book3.setPublisher("소니 픽쳐스 릴리징 브에나 비스타 영화㈜");
		book3.setCategory("스포츠");
		book3.setUnitsInStock(1000);	
		book3.setReleaseDate("2011/11/17");
		book3.setFilename("movie1236.jpg");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
		
		
	}
	public ArrayList<Book> getAllBooks() {
		return listOfBooks;
	}
	public Book getBookById(String bookId) {
		Book bookById = null;

		for (int i = 0; i < listOfBooks.size(); i++) {
			Book book = listOfBooks.get(i);
			if (book != null && book.getBookId() != null && book.getBookId().equals(bookId)) {
				
				bookById = book;
				break;
			}
		}
		return bookById;
	}
	
	public void addBook(Book book) {
		listOfBooks.add(book);
	}

}
