package com.pa.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginImpl implements Plugin<Project> {
    void apply(Project project) {
        project.task('testTaskPlugin') {
            doLast {
                println "testTaskPlugin"
            }
        }
    }
}