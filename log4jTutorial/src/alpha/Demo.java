package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("This is to debug");
		log.info("The object is present");
		log.error("There is an error");
		log.fatal("there is a fatal error");

	}

}
