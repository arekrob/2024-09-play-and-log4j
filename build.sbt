name := """2024-09-play-and-log4j"""

version := "1.0-SNAPSHOT"

javaOptions += "-Dlog4j.configurationFile=conf/log4j2.xml"

lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  .disablePlugins(PlayLogback)

scalaVersion := "2.13.14"

libraryDependencies += guice

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.14.3",
  "org.apache.logging.log4j" % "log4j-core" % "2.23.1",
)
