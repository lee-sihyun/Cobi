package site.itwill10.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

//입력값이 저장되는 필드에 어노테이션을 선언하여 유효성 검사  
public class Hewon {
	//@NotEmpty : 입력값의 유무를 검사하기 위한 어노테이션
	// => 에러 메세지는 어노테이션에서 제공하는 기본 메세지 사용
	// => 어노테이션의 message 속성의 속성값으로 사용할 메세지 설정
	@NotEmpty(message = "아이디를 반드시 입력해 주세요.")
	//@Size : 입력값의 길이를 검사하기 위한 어노테이션
	// => 어노테이션의 min 속성 또는 max 속성에 정수값을 이용하여 길이를 속성값으로 설정
	//@Size(min = 6, max = 20, message = "아이디는 최소 6자 이상 최대 20자 이하로만 입력 가능합니다.")
	//@Pattern : 입력값을 정규표현식으로 검사하기 위한 어노테이션
	// => 어노테이션에 regexp 속성에 정규표현식을 속성값으로 설정
	@Pattern(regexp = "^[a-zA-Z]\\w{5,19}$",message = "아이디를 형식에 맞게 입력해 주세요.")
	private String id;
	@Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[~!@#$%^&*_-]).{6,20}$",message = "비밀번호를 형식에 맞게 입력해 주세요.")
	private String passwd;
	@Pattern(regexp = "^[가-힣]{2,10}$",message = "이름을 형식에 맞게 입력해 주세요.")
	private String name;
	@NotEmpty(message = "이메일을 반드시 입력해 주세요.")
	//@Pattern(regexp = "^([a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+(\\.[-a-zA-Z0-9]+)+)*$",message = "이메일을 형식에 맞게 입력해 주세요.")
	@Email(message = "이메일을 형식에 맞게 입력해 주세요.")
	private String email;
	@NotEmpty(message = "성별을 반드시 입력해 주세요.")
	private String gender;
	
	public Hewon() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
