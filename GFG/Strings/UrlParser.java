package GFG.Strings;

public class UrlParser {
    public static String getProtocol(String urlString) {
        int endIndex = urlString.indexOf("://");
        if (endIndex != -1) {
            return urlString.substring(0, endIndex);
        }
        return null;
    }

    public static String getHostname(String urlString) {
        String protocolRemoved = urlString.replaceFirst(".*://", "");
        int endIndex = protocolRemoved.indexOf(':');
        if (endIndex != -1) {
            return protocolRemoved.substring(0, endIndex);
        }
        endIndex = protocolRemoved.indexOf('/');
        if (endIndex != -1) {
            return protocolRemoved.substring(0, endIndex);
        }
        return protocolRemoved;
    }

    public static int getPort(String urlString) {
        String protocolRemoved = urlString.replaceFirst(".*://", "");
        int startIndex = protocolRemoved.indexOf(':');
        int endIndex = protocolRemoved.indexOf('/');
        if (startIndex != -1 && endIndex != -1) {
            String portString = protocolRemoved.substring(startIndex + 1, endIndex);
            try {
                return Integer.parseInt(portString);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    public static String getPath(String urlString) {
        int startIndex = urlString.indexOf('/', urlString.indexOf("://") + 3);
        int endIndex = urlString.indexOf('?');
        if (startIndex != -1) {
            if (endIndex != -1) {
                return urlString.substring(startIndex, endIndex);
            }
            return urlString.substring(startIndex);
        }
        return null;
    }

    public static String getQuery(String urlString) {
        int startIndex = urlString.indexOf('?');
        int endIndex = urlString.indexOf('#');
        if (startIndex != -1) {
            if (endIndex != -1) {
                return urlString.substring(startIndex + 1, endIndex);
            }
            return urlString.substring(startIndex + 1);
        }
        return null;
    }

    static void urlData(String url) {
        String protocol = getProtocol(url);
        String query = getQuery(url);
        String hostName = getHostname(url);
        String path = getPath(url);
        System.out.println("Protocol is:- " + protocol);
        System.out.println("Query is:- " + query);
        System.out.println("Hostname is:- " + hostName);
        System.out.println("Path is:- " + path);
    }

    public static void main(String[] args) {
        String url = "https://www.example.com:8080/path/to/resource?name=aru#fragment";
        urlData(url);
    }
}
