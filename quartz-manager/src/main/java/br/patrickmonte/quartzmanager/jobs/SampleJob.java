package br.patrickmonte.quartzmanager.jobs;

import org.quartz.JobExecutionContext;

import br.patrickmonte.quartzmanager.jobs.entities.LogRecord;
import br.patrickmonte.quartzmanager.jobs.entities.LogRecord.LogType;

public class SampleJob extends AbstractLoggingJob {

	@Override
	public LogRecord doIt(JobExecutionContext jobExecutionContext) {
		return new LogRecord(LogType.INFO, "Hello!");
	}

}
