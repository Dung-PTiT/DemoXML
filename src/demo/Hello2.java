/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author Dell
 */
public class Hello2 implements Job{

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
       System.out.println("Hello Quartz 2");
    }
    
}
