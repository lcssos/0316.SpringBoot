package cn.martin.boot.controller;

import cn.martin.boot.component.FooComponent;
import cn.martin.boot.entity.Login;
import cn.martin.boot.repository.LoginMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by lcssos on 16/4/20.
 */
@RestController
@Slf4j
public class HomeController {

    @Resource
    private FooComponent fooComponent;
    @Resource
    private LoginMapper loginMapper;

    @RequestMapping("/home")
    public String home(){

        log.info(fooComponent.getUsername());

        Login login = loginMapper.selectByPrimaryKey(1000000L);
        log.info(login.getName());

        return "home";
    }
}
