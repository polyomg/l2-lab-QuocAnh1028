package Java5.lab4s.entities;


import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    @NotBlank(message = "Chưa nhập Email")
    @Email(message = "Email không đúng đinh dạng")
    private String id;
    @NotBlank(message = "Chưa nhập họ tên")
    private String fullname;
    @Builder.Default
    private String photo="Me.png";
    @Builder.Default
    @NotNull(message = "Chưa cho giới tính")
    private Boolean gender = true;
    @Builder.Default
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "Chưa nhập ngày sinh")
    @Past(message = "Ngày sinh không hợp lệ")
    private Date birthday = new Date();
    @Builder.Default
    @NotNull(message = "Chưa nhập lương")
    @Min(value = 1000, message = "Lương tối thiểu phải là 1000")
    private double salary=50000000.0;
    @Builder.Default
    private Integer level=0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
