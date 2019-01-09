package com.lelai.sales.controller;

import com.lelai.sales.WebSecurityConfig;
import com.lelai.sales.common.Result;
import com.lelai.sales.domain.modules.SysUser;
import com.lelai.sales.service.SysUserService;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author hw
 * @version on 2018/10/29
 */
@RestController
public class MainController {


    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/login")
    public Result login(HttpServletRequest request, HttpSession session) {
        Result result = new Result();

        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            result.setCode(-1);
            result.setMsg("用户名或密码不能为空！");
        }

        SysUser user = sysUserService.getSysUser(userName);

        // 校验用户名密码
        if (user == null) {
            result.setCode(-1);
            result.setMsg("用户名或密码错误！");
            return result;
        }
        try {
            byte[] salt = Hex.decodeHex(user.getPassword().substring(0, 16).toCharArray());
            String hashAlgorithmName = "SHA-1";
            Object result1 = new SimpleHash(hashAlgorithmName, password, salt, 1024);
            String result2 = user.getPassword().substring(0, 16) + result1.toString();

            if (result2.equals(user.getPassword())) {
                result.setCode(200);
                // 设置session
                session.setAttribute(WebSecurityConfig.SESSION_KEY, user);
            } else {
                result.setCode(0);
                result.setMsg("用户名或密码错误！");
            }
        } catch (DecoderException e) {
            e.printStackTrace();
            result.setCode(-2);
            result.setMsg("用户名或密码错误！");
        }
        return result;
    }

    @GetMapping("/getLoginUser")
    public SysUser getLoginUser(HttpSession session){
        return (SysUser) session.getAttribute(WebSecurityConfig.SESSION_KEY);
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "/a/login";
    }

}
