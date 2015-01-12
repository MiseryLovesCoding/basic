package com.misery.smart.job;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class TestJob implements Job{

    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        System.out.println("hello meng");
    }
    
    public static void main(String[] args) {
//        try {
//             // specify the job' s details..
//             JobDetail job = JobBuilder.newJob(TestJob.class)
//                                       .withIdentity("testJob")
//                                       .build();
//             // specify the running period of the job
//             Trigger trigger = TriggerBuilder.newTrigger()
//                     .withSchedule(SimpleScheduleBuilder.simpleSchedule()
//                                                        .withIntervalInSeconds(2)
//                                                        .repeatForever())
//                                                        .build();
//             //schedule the job
//             SchedulerFactory schFactory = new StdSchedulerFactory();
//             Scheduler sch = schFactory.getScheduler();
//             sch.start();
//             sch.scheduleJob(job, trigger);
//          } catch (SchedulerException e) {
//             e.printStackTrace();
//          }
        
        
        //cron
        SchedulerFactory schedulerfactory=new StdSchedulerFactory();  
        Scheduler scheduler=null;  
        try{  
            scheduler=schedulerfactory.getScheduler();  
            JobDetail job = JobBuilder.newJob(TestJob.class)
                    .withIdentity("job1", "group1")
                    .build();
            CronTrigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1", "group1")
                .withSchedule(CronScheduleBuilder.cronSchedule("0/1 * * * * ?"))
                .build();
            scheduler.scheduleJob(job, trigger);
            scheduler.start();  
        }catch(Exception e){  
            e.printStackTrace();  
        }  
    }

}
