package my.springboot.docker.hellodocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {

    @GetMapping
    public String helloDocker(){
        return "Boot from docker";
    }
}
