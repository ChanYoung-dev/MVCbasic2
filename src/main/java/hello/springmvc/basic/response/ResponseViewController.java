package hello.springmvc.basic.response;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    /**
     *
     *     public ModelAndView responseView1(ModelAndView mav){
     *         mav.setViewName("response/hello");
     *         mav.addObject("data","hello");
     *         return mav;
     *     }
     */
    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {

        ModelAndView mav = new ModelAndView("response/hello").addObject("data", "hello!");
        return mav;

    }


    /**
     * return "response/hello";
     * 컨트롤 클래스 위에 @Controller + 함수 위 @ResponseBody O-> 메시지 바디에 "response/hello" 들어감
     * 컨트롤 클래스 위에 @Controller + 함수 위 @ResponseBody X -> View(response/hello) 호출 (대신 String으로 반환 명시)
     * 컨트롤 클래스 위에 @RestController(@Controller + @ReseponseBody) -> 함수 전체에 @ResponseBody가 박힌 것으로 인정
     * HttpMessageConverter와 관련있음
     */
   @RequestMapping("/response-view-v2")
    public String responseViewV2(Model mav) {

        mav.addAttribute("data", "hello!");
        return "response/hello";

    }
}
