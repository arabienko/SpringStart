package by.arabienko.hibernate_many_to_many.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
public class Section {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String nameSection;

    @ManyToMany(cascade ={CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.MERGE})
    @JoinTable(name = "child_section",
    joinColumns = @JoinColumn(name = "section_id"),
    inverseJoinColumns = @JoinColumn(name = "child_id"))
    private List<Children> childrenList;

    public Section() {
    }

    public Section(String nameSection) {
        this.nameSection = nameSection;
    }


    public List<Children> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<Children> childrenList) {
        this.childrenList = childrenList;
    }


    public void addChildren(Children children) {
        if (childrenList==null) {
            childrenList = new ArrayList<>();
        }
        childrenList.add(children);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSection() {
        return nameSection;
    }

    public void setNameSection(String nameSection) {
        this.nameSection = nameSection;
    }

    @Override
    public String toString() {
        return "Sections{" +
                "id=" + id +
                ", nameSection='" + nameSection + '\'' +
                '}';
    }

}
