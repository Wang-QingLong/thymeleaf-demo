package com.ooo.controller;

import com.ooo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Date;

/**
 * @version V1.0
 * @author: WangQingLong
 * @date: 2019/12/28 10:30
 * @description:
 */
@Controller
public class demo1 {


    @GetMapping("/show1")
    public String show1(Model model) {

        model.addAttribute("hello","早上好！");

        return "hello";
    }


    @GetMapping("/show2")
    public String show2(Model model) {

        User user1 = new User();
        user1.setName("孙悟空");
        user1.setAge(20);
        User user2 = new User();
        user2.setName("猪八戒");
        user2.setAge(21);
        User user3 = new User();
        user3.setName("唐僧");
        user3.setAge(22);
        User user4 = new User();
        user4.setName("沙和尚");
        user4.setAge(23);

model.addAttribute("users",Arrays.asList(user1,user2,user3,user4));

        return "users";
    }



    @GetMapping("/show3")
    public String show3(Model model) {

        User user = new User();
        user.setName("亚东科技");
        user.setAge(10);
        user.setFriend(new User("亚东1号",11,null));
        model.addAttribute("user",user);

        return "user";
    }



    @GetMapping("/show4")
    public String show4(Model model) {

        model.addAttribute("date",new Date());

        return "date";
    }

    @GetMapping("/show5")
    public String show5(Model model) {

        model.addAttribute("msg","我想找一份工作");

        return "msg5";
    }


    @GetMapping("/show6")
    public String show6(Model model) {

        User user = new User();
        user.setName("鲁班大师");
        user.setAge(100);
        user.setFriend(new User("鲁班一号",10,null));
        model.addAttribute("user",user);

        return "Js";
    }

}
