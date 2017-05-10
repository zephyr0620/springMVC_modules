package HelloSpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xuantuo on 2017/5/10.
 */
@Controller
@RequestMapping(value = "/")
public class TestController {

    //访问地址：http://localhost:8080/returnSuccess
    @RequestMapping(value = "returnSuccess")    //实际访问的url地址
    public String returnSuccess(ModelMap mode) {
        mode.addAttribute("message","Hello Spring MVC Framework");
        return "/views/success";    //返回Views文件夹下的success.jsp页面
    }

}
