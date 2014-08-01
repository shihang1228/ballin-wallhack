#!/bin/sh

mkdir -p target/classes target/test-classes

javac -d target/classes src/main/java/com/baldurtech/FizzBuzz.java
javac -d target/test-classes -classpath "target/classes;lib/reflections-0.9.9-RC2.jar" src/test/java/com/baldurtech/*.java
