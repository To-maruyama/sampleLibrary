name := "sampleLibrary"

version := "1.0"

scalaVersion := "2.12.3"

organization := "com.sampleLibrary"

publishTo := Some(Resolver.file("sampleLibrary",file("."))(Patterns(true, Resolver.mavenStyleBasePattern)))
    