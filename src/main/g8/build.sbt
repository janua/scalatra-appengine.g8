import com.mojolly.scalate.ScalatePlugin._

organization := "$organisation$"

name := "$name$"

version := "$version$"

scalaVersion := "2.9.1"


// Target Settings
seq(scalateSettings:_*)

artifactName in packageWar :=  { (_, _, _) => "email-Share.war" }

// Dependency Management
resolvers ++= Seq(
  "Sonatype OSS" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "Guardian Github Releases" at "http://guardian.github.com/maven/repo-releases"
)

libraryDependencies ++= Seq(
  "com.google.appengine" % "appengine-api-1.0-sdk" % "1.6.3",
  "org.scalatra" %% "scalatra" % "2.0.4",
  "org.scalatra" %% "scalatra-scalate" % "2.0.4",
  "joda-time" % "joda-time" % "1.6.2",
  "org.slf4j" % "slf4j-api" % "1.6.4",
  "org.slf4j" % "slf4j-jdk14" % "1.6.4",
  "com.gu.openplatform" %% "content-api-client" % "1.16"
)

libraryDependencies ++= Seq(
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.eclipse.jetty" % "jetty-webapp" % "7.3.1.v20110307" % "container"
)

libraryDependencies ++= Seq(
  "com.google.appengine" % "appengine-api-stubs" % "1.6.4" % "test",
  "com.google.appengine" % "appengine-testing" % "1.6.4" % "test",
  "org.scalatest" %% "scalatest" % "1.6.1" % "test",
  "org.scalatra" %% "scalatra-scalatest" % "2.0.2" % "test",
  "org.scalatra" %% "scalatra-specs2" % "2.0.4" % "test",
  "net.liftweb" %% "lift-json" % "2.4"
)

libraryDependencies ++= Seq(
  "org.jsoup" % "jsoup" % "1.7.1"  
)

// Development Settings
seq(scalariformSettings: _*)

seq(appengineSettings: _*)

seq(Twirl.settings: _*)

// AppEngine environment test setup and teardown causes concurrency issues
parallelExecution in Test := false

// Compilation
maxErrors := 20

javacOptions ++= Seq("-source", "1.6", "-target", "1.6", "-encoding", "utf8")

scalacOptions ++= Seq("-unchecked", "-optimise", "-deprecation", "-Xcheckinit", "-encoding", "utf8")
