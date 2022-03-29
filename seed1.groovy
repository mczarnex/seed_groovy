def githubUrl = "https://github.com/mczarnex/seed_groovy.git"

pipelineJob("Seed job 1") {
definition {
    cpsScm {
      scm {
        git{
          remote {
            url("${githubUrl}")
            // credentials("${SSH_CREDENTIALS}")
          }
          branch("*/do-not-merge")
        }
      }
    }
  }
}