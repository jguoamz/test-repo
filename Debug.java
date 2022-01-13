package examples;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Debug {

    void debug(final String deploymentId) {
        String deploymentItem = null;
        try {
            deploymentItem = loadDeployment(deploymentId);
        } catch (final Exception e) {
            log.warn("", e);
        }
        doSomething(deploymentId, deploymentItem);
    }

    abstract private String loadDeployment(String deploymentId);

    abstract void doSomething(String a, String b);
}
