addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "1.1.0")
libraryDependencies += "mysql" % "mysql-connector-java"% "8.0.18"
addSbtPlugin("org.scalikejdbc" %% "scalikejdbc-mapper-generator" % "4.0.0")
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")
addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.9.0")
addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.9.4")
//addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.7.1")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "2.1.1")
