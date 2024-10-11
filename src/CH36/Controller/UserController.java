package CH36.Controller;

import java.util.HashMap;
import java.util.Map;

import CH36.Domain.Dto.UserDto;
import CH36.Domain.Service.UserServiceImpl;

public class UserController implements SubController {
	
	private UserServiceImpl userServiceImpl;
	public UserController() {
		try {
			userServiceImpl = UserServiceImpl.getInstance();
		} catch (Exception e) {
			ExceptionHandler(e);
			// e.printStackTrace();
		}
	}
	// 예외처리함수
	public Map<String, Object> ExceptionHandler(Exception e) {
		Map<String, Object> exMap = new HashMap();
		exMap.put("success", false);
		exMap.put("message", e.getMessage());
		exMap.put("exception", e);
		return exMap;
	}

	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] UserController execute()...");
		// 파라미터 받기(1:insert,2:update,3:delete,4:select,5:selectAll,6:login,7:logout)
		Integer serviceNo = (Integer) params.get("serviceNo");
		UserDto userDto = (UserDto) params.get("userDto");

		// 뷰전달 변수
		Map<String, Object> returnvalue = new HashMap();

		try {

			switch (serviceNo) {
			case 1: // add
				System.out.println("[SC] USerController add...");
				// 유효성 확인(Data)
				if (!isValid(userDto)) {
					// 유효성 체크 실패시 처리
					returnvalue.put("success", false);
					returnvalue.put("message", "회원 가입 실패");
					return returnvalue;
				}
				// 서비스 요청
				System.out.println("[SC] USerController dto : " + userDto);
				boolean isAdded = userServiceImpl.memberJoin(userDto);

				// 뷰로 전달
				if (isAdded) {
					returnvalue.put("success", true);
					returnvalue.put("message", "회원가입을 완료하였습니다.");
				} else {
					returnvalue.put("success", false);
					returnvalue.put("message", "회원가입을 하지못했습니다.");
				}
				break;

			case 2: // update
				System.out.println("[SC] USerController update...");
				if(!isValid(userDto)) {
					returnvalue.put("success", false);
					returnvalue.put("message", "회원정보 수정 실패");
					return returnvalue;
				}
				// 서비스 요청
				System.out.println("[SC] USerController dto : " + userDto);
				boolean isUpdate = userServiceImpl.memberJoin(userDto);
				
				// 뷰로 전달
				if(isUpdate) {
					returnvalue.put("success", true);
					returnvalue.put("message", "회원수정수정을 완료하였습니다");
				}else {
					returnvalue.put("success", false);
					returnvalue.put("message", "회원정보수정을 하지못했습니다.");
				}
				
				break;
			case 3: // delete
				System.out.println("[SC] USerController delete...");
				break;
			case 4: // select
				System.out.println("[SC] USerController select...");
				break;
			case 5: // selectAll
				System.out.println("[SC] USerController selectAll...");
				break;
			case 6: // login
				System.out.println("[SC] USerController Login...");
				break;
			case 7: // logout
				System.out.println("[SC] USerController Logout...");
				break;	
			default:
				break;

			}
		} catch (Exception e) {
			return ExceptionHandler(e);
		}
		return returnvalue;
	}

	//DATA 유효성 체크 함수
	private boolean isValid(UserDto dto) {
		

		return true;
	}

}
