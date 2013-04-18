package automation.api.interfaces;

import javax.xml.namespace.QName;

public interface ConnectedClient {
	void connectToRemoteDevice(String WS_URL, QName qname);
	boolean isDeviceAvailable();
	Object invokeMethod(String methodName) throws NoSuchMethodException;
	Object invokeMethod(String methodName, Object[] parametersArray) throws NoSuchMethodException;
}