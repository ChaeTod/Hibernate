package sk.it.sovy.Artem.enty;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "student", schema = "edr-onetomany-student")
public class StudentEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Basic
    @Column(name = "first_name", nullable = true, length = 45)
    private String firstName;

    @Basic
    @Column(name = "last_name", nullable = true, length = 45)
    private String lastName;

    @Basic
    @Column(name = "address", nullable = true, length = 45)
    private String address;

    @Basic
    @Column(name = "birthdate", nullable = true, length = 45)
    private Timestamp birthdate;

    @Basic
    @Column(name = "phone_number", nullable = true)
    private Integer phoneNumber;

    @Basic
    @Column(name = "enroll_date", nullable = true)
    private Date enrollDate;

    @Basic
    @Column(name = "faculty", nullable = true, length = 155)
    private String faculty;

    @Basic
    @Column(name = "course", nullable = true, length = 155)
    private String course;

    @Basic
    @Column(name = "group_number", nullable = true)
    private Integer groupNumber;

    @ManyToOne(targetEntity = SubjectDebtsEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private SubjectDebtsEntity subjectDebtsBySubjectId; // set up a relationship between student and his debts

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Timestamp birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    public SubjectDebtsEntity getSubjectDebtsBySubjectId() {
        return subjectDebtsBySubjectId;
    }

    public void setSubjectDebtsBySubjectId(SubjectDebtsEntity subjectDebtsBySubjectId) {
        this.subjectDebtsBySubjectId = subjectDebtsBySubjectId;
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
