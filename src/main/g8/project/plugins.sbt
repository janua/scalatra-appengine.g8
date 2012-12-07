resolvers ++= Seq(
    Classpaths.typesafeResolver,
    "Maven Central" at "http://repo1.maven.org/maven2",
    "Scala Tools Releases" at "http://scala-tools.org/repo-releases",
    "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
)

addSbtPlugin("com.typesafe.sbtscalariform" % "sbtscalariform" % "0.3.1")

libraryDependencies <+= sbtVersion(v => "com.github.siasia" %% "xsbt-web-plugin" % (v + "-0.2.10"))
libraryDependencies <+= sbtVersion(v => "com.mojolly.scalate" %% "xsbt-scalate-generator" % (v + "-0.1.6"))

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")
addSbtPlugin("com.eed3si9n" % "sbt-appengine" % "0.4.0")
addSbtPlugin("io.spray" % "sbt-twirl" % "0.6.1")

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.cc",
  Resolver.url("sbt-plugin-releases",
    url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
)

