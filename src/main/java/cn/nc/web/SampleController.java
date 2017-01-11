package cn.nc.web;

/**
 * Created by OuKyou on 2017/1/11.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/")
    String home(Model model) {
        model.addAttribute("name","WebDemo");
        return "index";
    }

}