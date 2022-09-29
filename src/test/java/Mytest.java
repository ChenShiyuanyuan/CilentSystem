import com.chen.pojo.Client;
import com.chen.service.ClientService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 东辉
 * guigu_SpringMVC
 */
public class Mytest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClientService clientServiceImpl = (ClientService) context.getBean("ClientServiceImpl");
        for (Client client : clientServiceImpl.queryAllClient()) {
            System.out.println(client);
        }
    }
}
