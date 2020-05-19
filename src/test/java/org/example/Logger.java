package org.example;

import org.apache.log4j.BasicConfigurator;
import org.junit.Test;

public class Logger {
    static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Logger.class);
    interface writeLog {
        public void Write(String content);
    }

    class Log2Screen implements writeLog {
        @Override
        public void Write(String content) {
            System.out.println(content);
        }
    }

    class Log2Mail implements writeLog {
        @Override
        public void Write(String content) {
            System.out.println("Send to mail....");
        }
    }

    class Log2File implements writeLog {
        @Override
        public void Write(String content) {
            System.out.println("Log to file....");
        }
    }

    @Test
    public void InitTest()
    {
        BasicConfigurator.configure();
        logger.info("nga xinh");
    }
}
