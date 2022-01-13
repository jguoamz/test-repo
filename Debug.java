package examples;

@Slf4j
public class Debug {

    void positive(final String deploymentId) {
        String deploymentItem = null;
        try {

            deploymentItem = loadDeployment(deploymentId);
        } catch (final Exception e) {
            log.warn("", e);
        }
        doSomething(deploymentId, deploymentItem);
    }

    private String loadDeployment(String deploymentId) {
        return "";
    }

    void doSomething(String a, String b) {

    }
}
