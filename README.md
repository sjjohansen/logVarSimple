# log4j hostname in filename

A really simple example to show we can add the current hostname to the log4j filename.

## Usage

```
mvn clean package
java -jar target/logVarSimple-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```

Should both print the log messages and create a logfile under the `logs` directory.

