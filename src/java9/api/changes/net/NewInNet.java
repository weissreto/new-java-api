package java9.api.changes.net;

import java.io.IOException;
import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import java.net.DatagramSocket;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.PasswordAuthentication;
import java.net.ProxySelector;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketOption;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;
import java.util.stream.Stream;

public class NewInNet
{
  public void authenticator()
  {
    Authenticator authenticator = Authenticator.getDefault();

    String host = null;
    InetAddress addr = null;
    int port = 0;
    String protocol = null;
    String prompt = null;
    String scheme = null;
    URL url = null;
    RequestorType reqType = null;
    PasswordAuthentication authentication = Authenticator.requestPasswordAuthentication(authenticator, host,
            addr, port, protocol, prompt, scheme, url, reqType);
    // more
  }

  public void datagramSocket() throws IOException
  {
    DatagramSocket socket = null;

    SocketOption<String> option = null;
    socket.getOption(option);

    String value = null;
    socket.setOption(option, value);

    Set<SocketOption<?>> supportedOptions = socket.supportedOptions();
  }

  public void serverSocket() throws IOException
  {
    ServerSocket socket = null;

    SocketOption<String> option = null;
    socket.getOption(option);

    String value = null;
    socket.setOption(option, value);

    Set<SocketOption<?>> supportedOptions = socket.supportedOptions();
  }

  public void socket() throws IOException
  {
    Socket socket = null;

    SocketOption<String> option = null;
    socket.getOption(option);

    String value = null;
    socket.setOption(option, value);

    Set<SocketOption<?>> supportedOptions = socket.supportedOptions();
  }

  public void httpUrlConnection()
  {
    HttpURLConnection connection = null;
    Authenticator auth = null;
    connection.setAuthenticator(auth);
  }

  public void multicastSocket()
  {
    MulticastSocket socket = null;

    Set<SocketOption<?>> supportedOptions = socket.supportedOptions();
  }

  public void networkInterface() throws SocketException
  {
    NetworkInterface.networkInterfaces();
    NetworkInterface network = null;
    Stream<InetAddress> inetAddresses = network.inetAddresses();
    Stream<NetworkInterface> subInterfaces = network.subInterfaces();
  }

  public void proxySelector()
  {
    InetSocketAddress proxyAddress = null;
    ProxySelector proxySelector = ProxySelector.of(proxyAddress);
  }

  public void urlConnection()
  {
    String protocol = null;
    boolean defaultVal = false;

    URLConnection.setDefaultUseCaches(protocol, defaultVal);

    URLConnection.getDefaultUseCaches(protocol);
  }

}
