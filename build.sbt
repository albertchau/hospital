name := "hospital"

version := "1.0"

lazy val `hospital` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq( jdbc , anorm , cache , ws,
  "mysql" % "mysql-connector-java" % "5.1.27")

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  