package ie.atu.labexam1;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Pattern()
    private String employeeCode;
    @NotBlank(message="Please Enter Name")
    private String name;
    @Email(message = "Please Enter Valid Email")
    private String email;
    @NotBlank(message = "Please Enter Position")
    private String position;
    @Positive(message = "Salary Must Be Positive")
    private long salay;
    @DateTimeFormat()
    private long date;

}
