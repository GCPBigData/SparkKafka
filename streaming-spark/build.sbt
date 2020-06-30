name := "spark-streaming"

version := "0.1"

scalaVersion := "2.13.3"

resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies ++= Seq("org.apache.spark" % "spark-streaming_3.0" % "3.0",

  "org.scalaj" %% "scalaj-http" % "3.0.0",

  "org.jfarcand" % "wcs" % "1.5")
