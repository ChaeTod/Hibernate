/*
package sk.it.sovy.Artem.enteties;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "academic_performance", schema = "edr-one-to-many-student")
public class AcademicPerformanceEntity {

    @Id
    @Column(name = "student_id", nullable = false)
    private Integer student_id;

    @Id
    @Column(name = "subject_id", nullable = false)
    private Integer subject_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private StudentEntity studentEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private SubjectEntity subjectEntity;

    private Integer rating;
    private Date examDate;

    public AcademicPerformanceEntity() {
    }

    public AcademicPerformanceEntity(Integer rating, Date examDate) {
        this.rating = rating;
        this.examDate = examDate;
    }

    @Basic
    @Column(name = "rating", nullable = true)
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "exam_date", nullable = true)
    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    @Override
    public String toString() {
        return "AcademicPerformanceEntity{" +
                "rating=" + rating +
                ", examDate=" + examDate +
                '}';
    }
}
*/
