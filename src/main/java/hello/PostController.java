package hello;

/**
 * Created by Администратор on 13.08.2016.
 */

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Date;


@RestController
@RequestMapping("/mobile")
public class PostController {
    private static final Logger log = LoggerFactory.getLogger(PostController.class);

    @RequestMapping(value="/", method = RequestMethod.POST)
    public Message gotMessage(@RequestBody Message message){
        log.info("------->" + message.getName() + ": " + message.getText());
        message.setTime(new Date().getTime());
        return message;
    }

    @RequestMapping(value="/user/registration", method = RequestMethod.POST)
    public User Registration(@RequestBody User user){
        log.info("------->" + user.getLogin() + ": " + user.getPassword());
        user.setPassword("OK");
        return user;
    }
}
