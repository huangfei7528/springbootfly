import com.fly.Application;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Application.class})
public class Test {


    @Autowired
    private RedisTemplate redisTemplate;


    @org.junit.Test
    public void redisTest(){
        redisTemplate.opsForValue().set("test","test");
    }


}
