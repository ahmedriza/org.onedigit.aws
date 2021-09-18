package org.onedigit.aws.secrets;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

public class CredentialsProvider implements AWSCredentialsProvider {

    /**
     * Empty constructor required as documented here:
     * https://hadoop.apache.org/docs/stable/hadoop-aws/tools/hadoop-aws/index.html
     */
    public CredentialsProvider() {

    }

    @Override
    public AWSCredentials getCredentials() {
        return new AWSCredentials() {
            @Override
            public String getAWSAccessKeyId() {
                return "custom_access_key";
            }

            @Override
            public String getAWSSecretKey() {
                return "custom_secret_key";
            }
        };
    }

    @Override
    public void refresh() {

    }
}
