package sk.it.sovy.Artem.enty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "subject_debts", schema = "edr-onetomany-student")
public class SubjectDebtsEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Basic
    @Column(name = "title", nullable = true, length = 128)
    private String title;

    @Basic
    @Column(name = "duration", nullable = true)
    private Integer duration;

    @Basic
    @Column(name = "rating", nullable = true, length = 1)
    private String rating;

    @Basic
    @Column(name = "debts", nullable = true)
    private Integer debts;

    @OneToMany(targetEntity = StudentEntity.class, fetch = FetchType.LAZY, mappedBy = "subjectDebtsBySubjectId", cascade=CascadeType.ALL)
    private List<StudentEntity> studentsById;

    public SubjectDebtsEntity() {
    }

    public SubjectDebtsEntity(String title, Integer duration, String rating, Integer debts) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
        this.debts = debts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Integer getDebts() {
        return debts;
    }

    public void setDebts(Integer debts) {
        this.debts = debts;
    }

    public List<StudentEntity> getStudentsById() {
        return studentsById;
    }

    public void setStudentsById(List<StudentEntity> studentsById) {
        this.studentsById = studentsById;
    }
}
