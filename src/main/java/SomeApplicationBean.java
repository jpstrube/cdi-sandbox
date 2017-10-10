import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SomeApplicationBean {

    private String foo = "Application " + Math.random();

    public String getFoo() {
        return foo;
    }

}
