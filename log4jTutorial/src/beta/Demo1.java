package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I have clicked on the link");
		log.info("The object is present");
		log.error("There is an error");
		log.fatal("there is a fatal error");

	}

}
