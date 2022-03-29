def githubUrl = "https://github.com/mczarnex/seed_groovy.git"

pipelineJob("Seed job 3") {
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
pipelineJob("Seed job 4") {
definition {
    cpsScm {
      scm {
        git{
          remote {
            url("${githubUrl}")
            // credentials("${SSH_CREDENTIALS}")
          }
          branch("*/seed-job-4")
        }
      }
    }
  }
}