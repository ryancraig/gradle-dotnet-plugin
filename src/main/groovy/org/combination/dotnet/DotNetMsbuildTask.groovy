package org.combination.dotnet

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

class DotNetMsbuildTask extends DotNetBaseTask {
    private def args = []

    @TaskAction
    public def run() {
        def a = ["msbuild"]
        if(args != null)
            a += args
        verbosity = null
        exec a
    }

    public void args(String[] args) {
        this.args = args
    }

    public void arg(String arg) {
        this.args += arg
    }
}