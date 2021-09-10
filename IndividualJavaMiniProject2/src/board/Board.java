package board;


public class Board {
	
	private String register;
	private String email;
	private String subject;
	private String content;
	private String password;
	

	public Board(String register, String email, String subject, String content, String password) {
		this.register = register;
		this.email = email;
		this.subject = subject;
		this.content = content;
		this.password = password;
	}
	
	
	public String getRegister() {
		return register;
	}
	
	
	public void setRegister(String register) {
		this.register = register;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getSubject() {
		return subject;
	}
	
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	public String getContent() {
		return content;
	}
	
	
	public void setContent(String content) {
		this.content = content;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "작성자 : " + register + " 이메일 : " + email + " 제목 : " + subject + " 글 내용 : " + content;
		
	}
	
	

}
