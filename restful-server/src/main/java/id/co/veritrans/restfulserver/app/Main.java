package id.co.veritrans.restfulserver.app;

import fj.P2;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoaderListener;

import java.net.ServerSocket;

/**
 * Created by gde on 1/9/15.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        final Server jettyServer = initJetty();
        jettyServer.start();
        jettyServer.join();
    }

    private static Server initJetty() {
        final Server jettyServer = new Server(1337);

        final ServletHolder servletHolder = new ServletHolder(new CXFServlet());
        final ServletContextHandler servletContextHandler = new ServletContextHandler();
        final ContextLoaderListener contextLoaderListener = new ContextLoaderListener();

        servletContextHandler.setContextPath("/");
        servletContextHandler.addServlet(servletHolder, "/rest-api/*");
        servletContextHandler.addEventListener(new ContextLoaderListener());
        servletContextHandler.setInitParameter("contextConfigLocation", "classpath:config/restful-server/spring-app-config.xml");

        jettyServer.setHandler(servletContextHandler);
        return jettyServer;
    }
}
