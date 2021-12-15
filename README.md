# Implicits in Scala

- This template is about Implicits in Scala.
- When we talk about implicits in Scala, we’re talking about two closely related language features: implicit parameters and implicit conversions. Both of these involve the compiler implicitly (i.e. invisibly) resolving certain type errors using extra information supplied in scope but not at the site of the type error.
- For implicit parameters, this is the error that occurs when a method call does not supply all the required parameters.
- For implicit conversions, it’s the error that occurs when a supplied type does not match the expected type.

## Prerequisites
- Scala Build Tool(SBT), version 1.4.7
- Scala, version 2.12.12

## Commands for project execution
- sbt compile - To compile the project
- sbt clean - Delete all generated files
