package toy.project.free3d.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //http 응답 body
public class TestController  {

    @GetMapping("/")
    public String Home(){
        return "hello";
    }
}
