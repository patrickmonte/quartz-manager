package br.patrickmonte.quartzmanager.aspects;

import org.quartz.SchedulerException;

public interface ProgressUpdater {

	void update() throws SchedulerException;

}
