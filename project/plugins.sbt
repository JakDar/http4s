libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"

// https://github.com/coursier/coursier/issues/450
classpathTypes += "maven-plugin"

addSbtPlugin("ch.epfl.scala"              %  "sbt-scalafix"              % "0.9.27")
addSbtPlugin("com.earldouglas"            %  "xsbt-web-plugin"           % "4.2.2")
addSbtPlugin("com.eed3si9n"               %  "sbt-buildinfo"             % "0.10.0")
addSbtPlugin("com.eed3si9n"               %  "sbt-unidoc"                % "0.4.3")
addSbtPlugin("com.github.tkawachi"        %  "sbt-doctest"               % "0.9.9")
addSbtPlugin("org.http4s"                 %  "sbt-http4s-org"            % "0.7.5")
addSbtPlugin("com.timushev.sbt"           %  "sbt-updates"               % "0.5.2")
addSbtPlugin("com.typesafe.sbt"           %  "sbt-ghpages"               % "0.6.3")
addSbtPlugin("com.typesafe.sbt"           %  "sbt-site"                  % "1.4.1")
addSbtPlugin("com.typesafe.sbt"           %  "sbt-twirl"                 % "1.5.1")
addSbtPlugin("com.typesafe.sbt"           %  "sbt-native-packager"       % "1.8.1")
addSbtPlugin("io.spray"                   %  "sbt-revolver"              % "0.9.1")
addSbtPlugin("org.scalameta"              %  "sbt-mdoc"                  % "2.2.18")
addSbtPlugin("pl.project13.scala"         %  "sbt-jmh"                   % "0.4.0")
