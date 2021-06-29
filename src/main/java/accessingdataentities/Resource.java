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
@Table(name="resource")
public class Resource {

    // define our fields

    // define constructors

    // define getter setters

    // define tostring

    // annotate fields

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="resourceID")
    private int resourceID;

    @Column(name="resourcename")
    private String resourcename;

    protected Resource() {

    }
    public Resource(int resourceID, String resourcename){
        this.resourceID = resourceID;
        this.resourcename = resourcename;
    }

    public int getResourceID() {
        return resourceID;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    @Override
    public String toString() {
        return "resourcename is " + resourcename;
    }


}
