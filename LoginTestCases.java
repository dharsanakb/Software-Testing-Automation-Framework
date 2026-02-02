public class LoginTestCases {
    public static void main(String[] args) {
        String u="admin";
        String p="1234";

        System.out.println("LOGIN TEST CASES");

        checkLogin("admin", "1234", u, p);
        checkLogin("admin", "1111", u, p);
        checkLogin("user", "1234", u, p);
        checkLogin("", "1234", u, p);
        checkLogin("admin", "", u, p);
    }
    static void checkLogin(String user, String pass, String validUser, String validPass){
        if(user.equals(validUser) && pass.equals(validPass)){
            System.out.println("Login successful");
        } else if(user.equals("") || pass.equals("")){
            System.out.println("Error: Empty field");
        }
        else {
            System.out.println("Login failed");
        }
    }
}