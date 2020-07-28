package com.pa.buildsrc

import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginImpl implements Plugin<Project> {
    void apply(Project project) {
        project.task('testTask') {
            doLast {
                println "自定义插件testTask"
            }
        }
    }
}