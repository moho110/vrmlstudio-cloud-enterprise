package com.vrmlstudio.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vrmlstudio.common.security.annotation.EnableCustomConfig;
import com.vrmlstudio.common.security.annotation.EnableRyFeignClients;
import com.vrmlstudio.common.swagger.annotation.EnableCustomSwagger2;

/**
 * Pay
 *
 * @author vrmlstudio
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class VrmlStudioPayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(VrmlStudioPayApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  Pay模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              ");
    }
}