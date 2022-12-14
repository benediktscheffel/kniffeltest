## sbt project compiled with Scala 3

![MAIN status](https://github.com/leotschritter/kniffel/actions/workflows/scala.yml/badge.svg)
[![Coverage Status](https://coveralls.io/repos/github/benediktscheffel/kniffeltest/badge.svg?branch=main)](https://coveralls.io/github/benediktscheffel/kniffeltest?branch=main)

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

### Test commands

```
sbt clean coverage test
```

```
sbt coverageReport
```

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).
