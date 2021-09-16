#!/bin/bash

SECRETS=`java -jar target/aws.secrets-1.0-SNAPSHOT.jar`
export MINIO_ROOT_USER=`echo $SECRETS | jq -r '.MINIO_ROOT_USER'`
export MINIO_ROOT_PASSWORD=`echo $SECRETS  | jq -r '.MINIO_ROOT_PASSWORD'`
echo $MINIO_ROOT_USER
echo $MINIO_ROOT_PASSWORD
