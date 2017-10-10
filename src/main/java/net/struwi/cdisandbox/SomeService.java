package net.struwi.cdisandbox;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/some")
public class SomeService {

    @Inject
    SomeApplicationBean someApplicationBean;

    @Inject
    SomeRequestBean someRequestBean;

    @GET
    @Produces("text/plain")
    public Response doGet() {
        return Response.ok(someApplicationBean.getFoo() + "\n" + someRequestBean.getFoo()).build();
    }

}
