package accessingdataentities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {

    // define our fields

    // define constructors

    // define getter setters

    // define tostring

    // annotate fields

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="projectID")
    private int projectID;

    @Column(name="projectname")
    private String projectname;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "username")
    private User user;

    protected Project() {

    }
    public Project(int projectID, String projectname){
        this.projectID = projectID;
        this.projectname = projectname;
    }

    public int getProjectID() {
        return projectID;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }
    //FK?
    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }

    @Override
    public String toString() {
        return "projectname is " + projectname;
    }


}