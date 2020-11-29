/*
package sk.it.sovy.Artem.en;

import javax.persistence.*;

@Entity
@Table(name = "subject_debts", schema = "edr-onetomany-student", catalog = "")
public class SubjectDebtsEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Integer duration;
    private String rating;
    private Integer debts;



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

    @Basic
    @Column(name = "title", nullable = true, length = 128)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "duration", nullable = true)
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "rating", nullable = true, length = 1)
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "debts", nullable = true)
    public Integer getDebts() {
        return debts;
    }

    public void setDebts(Integer debts) {
        this.debts = debts;
    }

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}) // it will apply for any operation like UPDATE/DELETE and etc. and update the associated subject accordingly
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private StudentEntity studentEntity;

    @Override
    public String toString() {
        return "SubjectDebtsEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", rating='" + rating + '\'' +
                ", debts=" + debts +
                '}';
    }
}
*/
