package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduledTasks {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	private static final SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate=5000)
	public void showDate(){
		
		logger.info("Starting time");
		logger.info("time now: "+ sdf.format(new Date()));
		logger.info("Ending time");
	}
	
}
