package edu.iiitb.esdlab3.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateRegistrationRequest {

    @NotBlank(message = "Student email is required")
    private String studentEmail;
}