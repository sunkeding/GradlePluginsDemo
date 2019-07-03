package com.keding.plugins.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author: skd* @date 2019-07-03
 * @Desc MyFirstPlugin
 */
class GreetingPluginExtension{
    String message = "Hello from GreetingPlugin"
}

class MyFirstPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        print("自定义插件MyFirstPlugin执行了！！！" + " project name:" + project.getName()+'\n')

        def extension  = project.extensions.create('greeting',GreetingPluginExtension)

        //增加一个hello task    ./gradlew hello
        project.task('hello'){
            doLast {
                println extension.message
            }
        }
    }
}

