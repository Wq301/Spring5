import com.wq.spring.dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-05-20 15:39
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
}