package org.yx;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yangxin
 */
@ConfigurationProperties(prefix = "mongo.base")
public class BaseProperties {
    private String test;

    private Distribute distribute;

    public static class Distribute {
        private String test1;

        public String getTest1() {
            return test1;
        }

        public void setTest1(String test1) {
            this.test1 = test1;
        }
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Distribute getDistribute() {
        return distribute;
    }

    public void setDistribute(Distribute distribute) {
        this.distribute = distribute;
    }
}
