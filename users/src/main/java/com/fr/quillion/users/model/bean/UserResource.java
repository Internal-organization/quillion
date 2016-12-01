package com.fr.quillion.users.model.bean;

import com.fr.quillion.resources.model.bean.Resource;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Les Choupinets on 13/11/2016.
 */
@Setter
@Getter
@Entity
@Table(name = "USER_RESOURCE")
public class UserResource implements Serializable{

    @Id
    @ManyToOne
    private User user;

    @Id
    @ManyToOne
    private Resource resource;

    private long quantity;

    @Version
    private long version;

    @Override
    public String toString() {
        return "[userId="+user.getId()+",resourceId="+resource.getId()+",quantity="+quantity+",version="+version+"]";
    }
}
