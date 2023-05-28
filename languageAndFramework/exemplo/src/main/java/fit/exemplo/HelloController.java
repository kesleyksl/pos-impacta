package fit.exemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fit.exemplo.services.HelloService;

@RestController
@RequestMapping("hello")
public class HelloController {
    @Autowired
    private HelloService svc;

    @GetMapping("")
    public String hello() {
        return this.svc.sayHello();
    }
}
