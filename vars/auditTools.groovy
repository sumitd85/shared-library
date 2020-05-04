def call(Map config){
	node{
		sh 'echo ${config.message}'
		sh '''
			git version
		'''
	}
}
