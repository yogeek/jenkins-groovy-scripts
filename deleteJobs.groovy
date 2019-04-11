// Launch in Jenkins script sandbox

//jenkins.model.Jenkins.instance.getAllItems(hudson.model.Job.class).each { println it.toString() + " has " + it.builds.size() + " builds" } ; return

// Delete all jobs between 0 and 3000 in an organization called "ORG"
Jenkins.instance.getItemByFullName('ORG/infra1.coucou/master').builds.findAll { it.number > 0 && it.number < 3000 }.each { it.delete() }
Jenkins.instance.getItemByFullName('ORG/infra1.coucou/auxiliary').builds.findAll { it.number > 0 && it.number < 3000 }.each { it.delete() }
Jenkins.instance.getItemByFullName('ORG/infra2.cuicui/master').builds.findAll { it.number > 0 && it.number < 3000 }.each { it.delete() }
