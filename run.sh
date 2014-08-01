#!/bin/sh
CLASSPATH="lib/guava-15.0.jar"
CLASSPATH="$CLASSPATH;lib/javassist-3.18.2-GA.jar"
CLASSPATH="$CLASSPATH;lib/reflections-0.9.9-RC2.jar"
CLASSPATH="$CLASSPATH;target/classes/";
CLASSPATH="$CLASSPATH;target/test-classes/"
java -classpath "$CLASSPATH" com.baldurtech.FizzBuzzTest
