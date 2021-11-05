#!/bin/sh

# define variables
SERVICE_NAME=@artifactId@
VERSION=@project.version@
JAR_NAME=$SERVICE_NAME-$VERSION.jar
#JAVA_OPTS="
#-XX:MetaspaceSize=256m
#-XX:MaxMetaspaceSize=256m
#-Xms2048m
#-Xmx2048m
#-Xmn512m
#-Xss256k
#-XX:SurvivorRatio=8
#-XX:+UseConcMarkSweepGC
#-XX:+PrintGCDetails
#"
JAVA_OPTS=""
LOG_FILE=./logs/$SERVICE_NAME.log

echo "find ${JAR_NAME} to kill before start process."
sh stop.sh
echo "------ begin start, see: ${LOG_FILE} ------"

nohup java $JAVA_OPTS -jar $JAR_NAME >/dev/null 2>&1 &
echo "${JAR_NAME} started successfully."
echo "JAVA_OPTS: ${JAVA_OPTS}"

# sleep 1s, make sure the process can start
sleep 1s

# it will blocking process
tail -0f $LOG_FILE