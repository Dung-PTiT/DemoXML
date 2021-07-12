/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzDemo {

    public static void main(String[] args) throws Exception {

        JobDetail job = new JobDetail();
        job.setName("helloJob");
        job.setJobClass(HelloJob.class);

        //Set the scheduler timings.
        CronTrigger trigger = new CronTrigger();
        trigger.setName("cronTrigger");
        //Execute the job after every 10 seconds.
        trigger.setCronExpression("0/10 * * * * ?");

        JobDetail job1 = new JobDetail();
        job1.setName("helloJob1");
        job1.setJobClass(Hello2.class);

        //Set the scheduler timings.
        CronTrigger trigger1 = new CronTrigger();
        trigger1.setName("cronTrigger1");
        //Execute the job after every 10 seconds.
        trigger1.setCronExpression("0/2 * * * * ?");

        //Execute the job.
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job, trigger);
        scheduler.scheduleJob(job1, trigger1);

    }

}
