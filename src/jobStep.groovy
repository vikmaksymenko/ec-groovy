// Run this script from job step

import com.electriccloud.client.groovy.ElectricFlow

ElectricFlow ef = new ElectricFlow()
ef.login('192.168.4.133', 'admin', 'changeme')

def result = ef.createJobStep(jobStepName: 'jobStep', command: 'echo hello', { response, data ->
    println 'Job step created'
    println data.dump
}, { response, data ->
    println 'Failed to create job step'
    println data.dump
})