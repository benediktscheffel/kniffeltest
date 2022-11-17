import org.scoverage.coveralls.GitHubActions
val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "kniffeltest",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    //libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    //libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.10",
    //libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test",
    libraryDependencies ++= Seq(
      "commons-io"             %  "commons-io"    % "2.11.0",
      "com.typesafe.akka"      %% "akka-actor"    % "2.6.20",
      "com.typesafe.akka"      %% "akka-testkit"  % "2.6.20" % "test",
      "org.scalatest"          %% "scalatest"     % "3.2.14" % "test"
    )
    /*jacocoCoverallsServiceName := "github-actions",
    jacocoCoverallsBranch := sys.env.get("CI_BRANCH"),
    jacocoCoverallsPullRequest := sys.env.get("GITHUB_EVENT_NAME"),
    jacocoCoverallsRepoToken := sys.env.get("COVERALLS_REPO_TOKEN")
    jacocoReportSettings := JacocoReportSettings(
      "Jacoco Coverage Report",
      None,
      JacocoThresholds(),
      Seq(JacocoReportFormats.ScalaHTML, JacocoReportFormats.XML), // note XML formatter
      "utf-8"),*/
  )
  import org.scoverage.coveralls.Imports.CoverallsKeys._

  coverallsTokenFile := Some("./.coverallsToken")
  coverallsService := Some(GitHubActions)
  
  coverageHighlighting := true
  coverageFailOnMinimum := false
  coverageMinimumStmtTotal := 60
  coverageMinimumBranchTotal := 60
  coverageMinimumStmtPerPackage := 0
  coverageMinimumBranchPerPackage := 0
  coverageMinimumStmtPerFile := 0
  coverageMinimumBranchPerFile := 0
  
  
  publishArtifact in Test := false
  parallelExecution in Test := false

  //.enablePlugins(JacocoCoverallsPlugin)
