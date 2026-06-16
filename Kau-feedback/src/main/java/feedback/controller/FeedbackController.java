package feedback.controller;

import feedback.entity.Feedback;
import feedback.repository.FeedbackRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FeedbackController {

    private final FeedbackRepository repository;

    public FeedbackController(
            FeedbackRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/feedback")
    public Feedback save(
            @RequestBody Feedback feedback) {

        return repository.save(feedback);
    }

    @GetMapping("/dashboard")
    public List<Feedback> dashboard() {

        return repository.findAll();
    }
}
