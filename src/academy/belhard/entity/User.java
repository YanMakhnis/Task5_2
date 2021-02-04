package academy.belhard.entity;

public class User extends Person {
    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;
    }
    public String getFullInfo(){
        return "Имя:" + super.getFullName()+" "+"\n"+"E-mail: "+email;
    }
    public boolean isPasswordCorrect(String password){
        if( password.equals(this.password)){
            return (true);
        }else
            return (false);
    }
}