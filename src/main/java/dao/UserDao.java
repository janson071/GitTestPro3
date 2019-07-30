package dao;


public class UserDao {
    private String userId;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        System.out.println("1.0版本上增加的方法");
        return userId;
    }

}
