name := "sampleLibrary"

version := "1.0"

scalaVersion := "2.12.3"

publishTo := Some(Resolver.file("hello",file("hello"))(Patterns(true, Resolver.mavenStyleBasePattern)))
    