def call(Map stageParam) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: stageParam.branch]],
        userRemoteConfigs: [[url: stageParam.url]]
    ])
}
