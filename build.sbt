lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.vaskoz.ctci6",
      scalaVersion := "2.12.4"
    )),
    name := "ctci6-scala"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
