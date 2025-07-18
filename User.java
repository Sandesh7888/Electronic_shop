package Project_Java;

class User
{
    private String name;
    private String email;
    private String mobileNumber;
    private String location;
    private String username;
    private String password;

    public User(String name, String email, String mobileNumber, String location, String username, String password) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.location = location;
        this.username = username;
        this.password = password;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getMobileNumber() { return mobileNumber; }
    public String getLocation() { return location; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}
