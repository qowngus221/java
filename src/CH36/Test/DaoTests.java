package CH36.Test;

import java.util.List;

import org.junit.jupiter.api.Test;

import CH36.Domain.Dao.BookDaoImpl;
import CH36.Domain.Dao.UserDaoImpl;
import CH36.Domain.Dto.BookDto;
import CH36.Domain.Dto.UserDto;

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
	@Test
	void UserDaoInsert() throws Exception{
		UserDaoImpl dao = UserDaoImpl.getInstance();
		int result = dao.insert(new UserDto("aaa","111","ROLE_USER",false));
		System.out.println("계정 INSERT 성공여부 : " + result);
	}
	@Test
	void UserDaoUpdate() throws Exception{
		UserDaoImpl dao=UserDaoImpl.getInstance();
		int result = dao.update(new UserDto("aaa","222","role_user",false));
		System.out.println("계정 UPDATE 성공여부 : " + result);
	}
//	@Test
//	void UserDaoDelete() throws Exception{
//		UserDaoImpl dao=UserDaoImpl.getInstance();
//		Long result = dao.delete(1234L);
//		System.out.println("계정 UPDATE 성공여부 : " + result);
//	}
	
	@Test
	void BookDaoTest_Pool()throws Exception {
		BookDaoImpl dao = BookDaoImpl.getInstance();
		
		dao.insert(new BookDto(1213L,"a","a","a"));
		dao.insert(new BookDto(1214L,"a","a","a"));
		dao.update(new BookDto(1215L,"a","a","a"));
		dao.insert(new BookDto(1216L,"a","a","a"));
		
	}
	@Test
	void UserDaoTest_Pool() throws Exception{
		UserDaoImpl dao = UserDaoImpl.getInstance();
		dao.insert(new UserDto("eee","123","ROLE_USER",false));
	}
	
}