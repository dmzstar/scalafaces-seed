name := """$name$"""
organization := "$organization$"
version := "0.1.0"


scalaVersion := "2.13.0"

resolvers ++= Seq(
  "snapshots"     at "https://oss.sonatype.org/content/repositories/snapshots",
  "staging"       at "https://oss.sonatype.org/content/repositories/staging",
  "releases"      at "https://oss.sonatype.org/content/repositories/releases"
)

enablePlugins(TomcatPlugin)

containerLibs in Tomcat := Seq("com.github.jsimone" % "webapp-runner" % "9.0.14.0" intransitive())

webappWebInfClasses := true
unmanagedResourceDirectories in Test += baseDirectory.value / "src/main/webapp"

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  Seq(
    "ch.qos.logback"    % "logback-classic"         % "1.2.3",
    "org.specs2" %% "specs2-core" % "4.6.0" % Test
  )
}

scalacOptions in Test ++= Seq("-Yrangepos")


libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.1.0"
libraryDependencies += "javax.validation" % "validation-api" % "2.0.1.Final"


libraryDependencies += "org.jboss.weld.servlet" % "weld-servlet-core" % "3.1.1.Final"
libraryDependencies += "org.glassfish" % "javax.faces" % "2.3.9"
libraryDependencies += "org.omnifaces" % "omnifaces" % "3.3"
libraryDependencies += "org.primefaces" % "primefaces" % "7.0"
libraryDependencies += "org.primefaces.extensions" % "primefaces-extensions" % "7.0"
libraryDependencies += "org.primefaces.extensions" % "resources-ckeditor" % "7.0" % "runtime"


//Bootstrap 4.3.1, JQuery 3.4.1
libraryDependencies += "org.butterfaces" % "components" % "3.1.1"
//Bootstrap 3 and jQuery UI
libraryDependencies += "net.bootsfaces" % "bootsfaces" % "1.4.1"











