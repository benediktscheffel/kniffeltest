name := "kniffeltest"

organization := "org.scoverage"

version := "1.6.1"

scalaVersion := "3.2.0"

crossScalaVersions := Seq("2.13.9", "3.2.0")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Werror")

libraryDependencies ++= Seq(
  "commons-io"             %  "commons-io"    % "2.11.0",
  "com.typesafe.akka"      %% "akka-actor"    % "2.6.20",
  "com.typesafe.akka"      %% "akka-testkit"  % "2.6.20" % "test",
  "org.scalatest"          %% "scalatest"     % "3.2.14" % "test"
)

import org.scoverage.coveralls.Imports.CoverallsKeys._
coverallsTokenFile :=  sys.env.get("COVERALLS_REPO_TOKEN")
coverageHighlighting := true
coverageFailOnMinimum := false
coverageMinimumStmtTotal := 70
coverageMinimumBranchTotal := 70
coverageMinimumStmtPerPackage := 0
coverageMinimumBranchPerPackage := 0
coverageMinimumStmtPerFile := 0
coverageMinimumBranchPerFile := 0


publishArtifact in Test := false
parallelExecution in Test := false