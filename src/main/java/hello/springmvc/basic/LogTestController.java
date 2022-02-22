package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        System.out.println("name = " + name);
        log.info("info log = {}", name);
        log.trace("trace log = {}", name);
        log.debug("trace log = {}", name);
        log.warn("trace log = {}", name);
        log.error("trace log = {}", name);


        // 기존 @Controller는 viewName을 반환했다
        //하지만 @RestController는 HTTP Body에 바로 내용을 박는다
        return "ok";
    }
}
