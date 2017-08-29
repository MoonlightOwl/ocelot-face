name := "ocelot-face"
version := "0.1.0"

scalaVersion := "2.12.3"

enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true
skip in packageJSDependencies := false

jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.1"
