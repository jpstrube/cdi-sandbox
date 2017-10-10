import org.jglue.cdiunit.CdiRunner;
import org.jglue.cdiunit.InRequestScope;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

@RunWith(CdiRunner.class)
public class SomeServiceTest {

    @Inject
    SomeService someService;

    @Test
    @InRequestScope
    public void testInjection() {
        Response response = someService.doGet();
        System.out.println((String) response.getEntity());
        assert(true);
    }

}
