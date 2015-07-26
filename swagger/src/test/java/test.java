import com.wpj.swagger.controller.EmptypeController;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/26.17:02
 * ****************************************************
 */
@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:swagger_config/spring_mvc.xml"})
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class test {
    @Resource
    EmptypeController emptypeController;
   @Test
    public void asa(){
       System.out.println(emptypeController);
   }
}
