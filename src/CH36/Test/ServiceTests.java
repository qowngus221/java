package CH36.Test;

import java.util.List;

import org.junit.jupiter.api.Test;

import CH36.Domain.Dto.BookDto;
import CH36.Domain.Service.BookServiceImpl;

class ServiceTests {

	@Test
	void BookServiceImpl_1() throws Exception {
		BookServiceImpl service = BookServiceImpl.getInstance();
		boolean isSuccess =
		service.bookRegistration(new BookDto(1122L,"이것이C언어다","오렌지미디어","121212"));
		System.out.println("도서 등록여부 : " + isSuccess);
	}
	@Test
	void BookServiceImpl_2() throws Exception {
		BookServiceImpl service = BookServiceImpl.getInstance();
		List<BookDto> list = service.getBooks(); 
		list.forEach(el->System.out.println(el));

	}
}
