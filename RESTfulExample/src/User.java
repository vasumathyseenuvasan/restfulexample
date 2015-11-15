import javax.xml.bind.annotation.*;

@XmlRootElement
public class User {

	private String userName;
	private Integer userId;
	
	public User()
	{
		userName = "Not mentioned";
		userId = new Integer(0);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}	
}
