package EDOSF.methods;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class RetryRule implements TestRule {
    private int retryCount;

    public RetryRule(int retryCount) {
        this.retryCount = retryCount;
    }

    @Override
    public Statement apply(final Statement base, final Description description) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                Throwable caughtThrowable = null;

                // implement retry logic here
                for (int i = 0; i < retryCount; i++) {
                    try {
                        base.evaluate();
                        return;
                    } catch (Throwable t) {
                        caughtThrowable = t;
                        System.err.println(description.getDisplayName() + ": run " + (i+1) + " failed");
                    }
                }
                System.err.println(description.getDisplayName() + ": giving up after " + retryCount + " failures");
                throw caughtThrowable;
            }
        };
    }
}