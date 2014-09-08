This is a quick example of logging in Scala using SLF4S and logback.  SLF4S is a Scala-friendly wrapper for SLF4J.  This project also uses a custom JSON encoder for the log messages.  The encoder was created for another project and exists in our java services repository.

When you run the program, it will log some sample messages, one of which includes an exception.  The log file will be at /var/log/balihoo/test.log.  If this directory doesn't exist, or if you don't have write access to it, you won't get a log file.  You can configure the logging behavior in logtest/src/main/resources/logback.xml.  It's possible to log to multiple locations and in multiple formats.  See http://logback.qos.ch/manual/index.html.

The code that produces the output is logtest/src/main/scala/com/balihoo/logtest/LogTest.scala.
