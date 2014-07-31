#!/bin/sh

mkdir -p target/classes target/test-classes

javac -d target/classes src/main/java/com/baldurtech/FizzBuzz.java
javac -d target/test-classes -classpath target/classes src/test/java/com/baldurtech/FizzBuzzTest.java
