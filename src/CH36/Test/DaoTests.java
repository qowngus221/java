package CH36.Test;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import CH01.C01SystemOut;
import CH36.Domain.Dao.BookDaoImpl;
import CH36.Domain.Dto.BookDto;

class DaoTests {

	
	@Test
	void BookDaoConnect() throws Exception{
		BookDaoImpl dao=BookDaoImpl.getInstance();
	}
	@Test
	void BookDaoInsert() throws Exception{
		BookDaoImpl dao=BookDaoImpl.getInstance();
		dao.insert(new BookDto(1,"이것이리눅스다","한빛미디어","111-111"));
	}
	@Test
	void BookDaoUpdate() throws Exception{
		BookDaoImpl dao=BookDaoImpl.getInstance();
		dao.update(new BookDto(1,"이것이자바다","한빛미디어","222-222"));
	}
	@Test
	void BookDaoDelete() throws Exception{
		BookDaoImpl dao=BookDaoImpl.getInstance();
		dao.delete(1);
	}
	@Test
	void BookDaoSelect() throws Exception{
		BookDaoImpl dao=BookDaoImpl.getInstance();
		List<BookDto> list = dao.select();
		list.forEach(dto->System.out.println(dto));		
	}
	@Test
	void BookDaoSelect2() throws Exception{
		BookDaoImpl dao=BookDaoImpl.getInstance();
		BookDto dto =  dao.select(30000002453014L);
		System.out.println(dto);
	}
	
	
}