# Summary

The purpose of this is to use the AWS Java SDK to interact with the AWS Secrets Manager API.
It uses the API to get the secrets stored in the Secrets Manager.

# Building
```shell
mvn clean install
```

This will create a fat jar in the `target` directory.

# Running
```shell
java -jar target/aws.secrets-1.0-SNAPSHOT.jar
```

This is in json format.  We can use `jq` to extract values, e.g. 

```shell
#!/bin/bash
SECRETS=`java -jar target/aws.tools-1.0-SNAPSHOT.jar org.onedigit.aws.secrets.SecretsHelper`
export MINIO_ROOT_USER=`echo $SECRETS | jq -r '.MINIO_ROOT_USER'`
export MINIO_ROOT_PASSWORD=`echo $SECRETS  | jq -r '.MINIO_ROOT_PASSWORD'`
```