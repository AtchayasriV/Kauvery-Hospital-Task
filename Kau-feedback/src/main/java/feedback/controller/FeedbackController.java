package feedback.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="feedback_entries")
@Data
public class Feedback {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String patientName;
    private Integer age;
    private String visitType;
    private String department;
    private String serviceName;
    private Integer rating;
    private String comments;
}
