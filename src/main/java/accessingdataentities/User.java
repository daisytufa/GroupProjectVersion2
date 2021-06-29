package accessingdataentities;


import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

    // define our fields

    // define constructors

    // define getter setters

    // define tostring

    // annotate fields

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    //@OneToMany(cascade=CascadeType.ALL)
//The default constructor exists only for the sake of JPA. You do not use it directly,
// so it is designated as protected.
    protected User() {

    }

    public User(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "username is " + username;
    }


}