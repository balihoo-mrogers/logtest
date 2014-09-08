name := "logtest"

version := "1.0"

resolvers ++= Seq(
  "Internal Snapshot Repository" at "http://oak.dev.balihoo.local:8080/archiva/repository/snapshots/",
  "Internal Repository" at "http://oak.dev.balihoo.local:8080/archiva/repository/internal/"
)

libraryDependencies ++= Seq(
  "com.balihoo.commons" % "commons-server" % "latest.snapshot",
  "org.slf4s" %% "slf4s-api" % "1.7.7",
  "ch.qos.logback" % "logback-classic" % "1.1.2"
)
