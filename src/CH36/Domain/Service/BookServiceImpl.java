package CH36.Domain.Service;

import java.util.List;

import CH36.Domain.Dao.BookDaoImpl;
import CH36.Domain.Dto.BookDto;

public class BookServiceImpl {
	
	//BookDao 연결
	private BookDaoImpl bookDaoImpl;
	
	//싱글톤 패턴 처리코드
	private BookServiceImpl() throws Exception {
		System.out.println("[SERVICE] BookServiceImpl()..");
		bookDaoImpl = BookDaoImpl.getInstance();
	};
	private static BookServiceImpl instance;
	public static BookServiceImpl getInstance() throws Exception {
		if(instance==null)
			instance = new BookServiceImpl();
		return instance;
	}
	
	//도서등록
	public boolean bookRegistration(BookDto dto) throws Exception{
		//추가사항(role 에 따른 사용가능 여부체크,비즈니스 유효성체크, Tx처리)
		return bookDaoImpl.insert(dto) > 0;
		
		
	}
	//도서내용수정
	public boolean bookUpdate(BookDto dto) throws Exception {
		return bookDaoImpl.update(dto) > 0;
	}
	//도서삭제
	public boolean bookRemove(long bookCode) throws Exception{
		return bookDaoImpl.delete(bookCode) > 0;
	}
	//도서 조회(단건 - BookDto)
	public BookDto getBook(long bookCode) throws Exception {
		return bookDaoImpl.select(bookCode);
	}
	//도서 조회(다건 - List<BookDto>)
	public List<BookDto> getBooks() throws Exception{
		return bookDaoImpl.select();
	}
	
}
