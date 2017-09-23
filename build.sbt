name := "sampleLibrary"

version := "1.0"

scalaVersion := "2.12.3"

publishTo := Some(Resolver.file("Hello",file("/Users/maru/project/sampleLibrary"))(Patterns(true, Resolver.mavenStyleBasePattern)))
    