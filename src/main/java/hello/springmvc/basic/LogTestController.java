package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
//일반 Controller 애노테이션에서는 return 으로 반환 받는 String이 뷰의 이름이라면 RestController에서는 그냥 return으로 반환되는 String이 그대로 출력
@RestController
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        //얘는 그냥 다 출력
        System.out.println("name = " + name);

        //즉 레벨에 따라 출력되는 애들이 달라진다.
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log = {}", name);
        log.warn(" warn log = {}", name);
        log.error("error log = {}", name);

        return "ok";
    }
}
