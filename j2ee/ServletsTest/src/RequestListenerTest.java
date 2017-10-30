import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;


public class RequestListenerTest implements ServletRequestListener {

	
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("REQUEST OBJECT DESTRYOED");
	}
	
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("REQUEST OBJECT CREATED");
	}
	
}
