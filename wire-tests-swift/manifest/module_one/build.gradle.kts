plugins {
  id("swift-library")
  id("xcode")
  id("xctest")
}

library {
  dependencies {
    api(projects.wireRuntimeSwift)
  }

  module.set("module_one")

  source.from(file("."))
}

tasks.matching { it.name == "compileReleaseSwift" }.configureEach {
  dependsOn("compileDebugSwift")
}
tasks.getByName("spotlessJava").dependsOn("compileDebugSwift")
tasks.getByName("spotlessKotlin").dependsOn("compileDebugSwift")
tasks.getByName("spotlessSwift").dependsOn("compileDebugSwift")
