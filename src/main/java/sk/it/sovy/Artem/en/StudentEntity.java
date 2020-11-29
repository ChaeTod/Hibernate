/*
package sk.it.sovy.Artem.en;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "student", schema = "edr-onetomany-student", catalog = "")
public class StudentEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String address;
    private Timestamp birthdate;
    private Integer phoneNumber;
    private Date enrollDate;
    private String faculty;
    private String course;
    private Integer groupNumber;
    private Integer subject_id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<SubjectDebtsEntity> subjectDebtsEntityList;

    public StudentEntity() {
    }

    public StudentEntity(String firstName, String lastName, String address, Timestamp birthdate, Integer phoneNumber, Date enrollDate, String faculty, String course, Integer groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.enrollDate = enrollDate;
        this.faculty = faculty;
        this.course = course;
        this.groupNumber = groupNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name", nullable = true, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = true, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 45)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "birthdate", nullable = true)
    public Timestamp getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Timestamp birthdate) {
        this.birthdate = birthdate;
    }

    @Basic
    @Column(name = "phone_number", nullable = true)
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "enroll_date", nullable = true)
    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    @Basic
    @Column(name = "faculty", nullable = true, length = 155)
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Basic
    @Column(name = "course", nullable = true, length = 155)
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Basic
    @Column(name = "group_number", nullable = true)
    public Integer getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<SubjectDebtsEntity> getSubjectDebtsEntityList() {
        return subjectDebtsEntityList;
    }

    public void setSubjectDebtsEntityList(List<SubjectDebtsEntity> subjectDebtsEntityList) {
        this.subjectDebtsEntityList = subjectDebtsEntityList;
    }

    @Basic
    @Column(name = "subject_id", nullable = true)
    public Integer getSubject_id() {
        return subject_id;
    }

    @Basic
    @Column(name = "subject_id", nullable = true)
    public void setSubject_id(Integer subject_id) {
        this.subject_id = subject_id;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", birthdate=" + birthdate +
                ", phoneNumber=" + phoneNumber +
                ", enrollDate=" + enrollDate +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
*/
