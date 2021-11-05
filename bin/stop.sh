#!/bin/sh

# define variables
SERVICE_NAME=@artifactId@
VERSION=@project.version@
JAR_NAME=$SERVICE_NAME-$VERSION.jar
PORT=@service.port@

PROCESS=`ps auxww | grep ${JAR_NAME} | grep ${PORT} | grep -v grep`
if [ "$PROCESS" = "" ]; then
  echo "process ${JAR_NAME} not exists"
else
  SID=`echo $PROCESS | awk '{print $2 }'`
  echo "prepare to kill "$PROCESS
  echo "begin kill "$SID" ..."
  kill -9 $SID
  echo "kill successfully"
fi;