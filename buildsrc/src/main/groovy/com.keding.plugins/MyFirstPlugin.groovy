package com.keding.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author: skd* @date 2019-07-03
 * @Desc MyFirstPlugin
 */
class MyFirstPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        print("自定义插件代码执行了！！！" + "   project name:" + project.getName())

    }
}
