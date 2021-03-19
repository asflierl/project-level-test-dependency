ThisBuild / scalaVersion := "2.13.5"
ThisBuild / scalacOptions := Seq("-unchecked", "-deprecation", "-language:_", "-target:11", "-encoding", "UTF-8", "-Yrangepos")
Global / sourcesInBase := false

lazy val root = project.in(file(".")).aggregate(seriousApp, libTesting)

lazy val seriousApp = project.in(file("seriousApp")).dependsOn(libTesting % Test)

lazy val libTesting = project.in(file("libTesting")).dependsOn(libSyntaxSugar)
  .settings(
    libraryDependencies := Seq("org.specs2" %% "specs2-core" % "4.10.6"))

lazy val libSyntaxSugar = project.in(file("libSyntaxSugar"))
