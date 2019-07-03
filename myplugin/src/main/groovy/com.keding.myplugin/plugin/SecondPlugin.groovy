package com.keding.myplugin.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author: skd* @date 2019-07-03
 * @Desc SecondPlugin
 */
class SecondPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        print("来自SecondPlugin的hello world!!!")
    }
}
