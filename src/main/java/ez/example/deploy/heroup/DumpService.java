package ez.example.deploy.heroup;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dump")
public class DumpService {

    @RequestMapping("hello")
    public CustomReponse helloEndpoint() {
        return new CustomReponse("Elmehdi ");
    }

    class CustomReponse {
        private String content;

        public CustomReponse(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
