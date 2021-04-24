def call(Map getval) {
	checkout([$class: 'GitSCM', 
	branches: [[ name: getval.branch ]], 
	userRemoteConfigs: [[credentialsId: 'gitcred', url: getval.url ]]
	])
  }
